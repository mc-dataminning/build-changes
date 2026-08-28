import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public record cxh(cxh.a e, IntList f, IntList g, boolean h, boolean i) implements cxu {
   public static final cxh a = new cxh(cxh.a.a, IntList.of(), IntList.of(), false, false);
   public static final Codec<IntList> b = Codec.INT.listOf().xmap(IntArrayList::new, ArrayList::new);
   public static final Codec<cxh> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cxh.a.g.fieldOf("shape").forGetter(cxh::a),
               b.optionalFieldOf("colors", IntList.of()).forGetter(cxh::b),
               b.optionalFieldOf("fade_colors", IntList.of()).forGetter(cxh::c),
               Codec.BOOL.optionalFieldOf("has_trail", false).forGetter(cxh::d),
               Codec.BOOL.optionalFieldOf("has_twinkle", false).forGetter(cxh::e)
            )
            .apply($$0, cxh::new)
   );
   private static final zm<ByteBuf, IntList> j = zk.f.a(zk.a()).a(IntArrayList::new, ArrayList::new);
   public static final zm<ByteBuf, cxh> d = zm.a(cxh.a.f, cxh::a, j, cxh::b, j, cxh::c, zk.b, cxh::d, zk.b, cxh::e, cxh::new);
   private static final xo k = xo.c("item.minecraft.firework_star.custom_color");

   @Override
   public void a(cuj.b $$0, Consumer<xo> $$1, cwh $$2) {
      this.a($$1);
      this.b($$1);
   }

   public void a(Consumer<xo> $$0) {
      $$0.accept(this.e.a().a(n.h));
   }

   public void b(Consumer<xo> $$0) {
      if (!this.f.isEmpty()) {
         $$0.accept(a(xo.i().a(n.h), this.f));
      }

      if (!this.g.isEmpty()) {
         $$0.accept(a(xo.c("item.minecraft.firework_star.fade_to").b(xn.v).a(n.h), this.g));
      }

      if (this.h) {
         $$0.accept(xo.c("item.minecraft.firework_star.trail").a(n.h));
      }

      if (this.i) {
         $$0.accept(xo.c("item.minecraft.firework_star.flicker").a(n.h));
      }
   }

   private static xo a(yc $$0, IntList $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1.getInt($$2)));
      }

      return $$0;
   }

   private static xo a(int $$0) {
      cth $$1 = cth.b($$0);
      return (xo)($$1 == null ? k : xo.c("item.minecraft.firework_star." + $$1.b()));
   }

   public cxh a(IntList $$0) {
      return new cxh(this.e, this.f, new IntArrayList($$0), this.h, this.i);
   }

   public cxh.a a() {
      return this.e;
   }

   public IntList b() {
      return this.f;
   }

   public IntList c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }

   public boolean e() {
      return this.i;
   }

   public static enum a implements azt {
      a(0, "small_ball"),
      b(1, "large_ball"),
      c(2, "star"),
      d(3, "creeper"),
      e(4, "burst");

      private static final IntFunction<cxh.a> h = axo.a(cxh.a::b, values(), axo.a.a);
      public static final zm<ByteBuf, cxh.a> f = zk.a(h, cxh.a::b);
      public static final Codec<cxh.a> g = azt.b(cxh.a::values);
      private final int i;
      private final String j;

      private a(final int $$0, final String $$1) {
         this.i = $$0;
         this.j = $$1;
      }

      public yc a() {
         return xo.c("item.minecraft.firework_star.shape." + this.j);
      }

      public int b() {
         return this.i;
      }

      public static cxh.a a(int $$0) {
         return h.apply($$0);
      }

      @Override
      public String c() {
         return this.j;
      }
   }
}
