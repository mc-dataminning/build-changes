import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public record czv(czv.a e, IntList f, IntList g, boolean h, boolean i) implements daj {
   public static final czv a = new czv(czv.a.a, IntList.of(), IntList.of(), false, false);
   public static final Codec<IntList> b = Codec.INT.listOf().xmap(IntArrayList::new, ArrayList::new);
   public static final Codec<czv> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               czv.a.g.fieldOf("shape").forGetter(czv::a),
               b.optionalFieldOf("colors", IntList.of()).forGetter(czv::b),
               b.optionalFieldOf("fade_colors", IntList.of()).forGetter(czv::c),
               Codec.BOOL.optionalFieldOf("has_trail", false).forGetter(czv::d),
               Codec.BOOL.optionalFieldOf("has_twinkle", false).forGetter(czv::e)
            )
            .apply($$0, czv::new)
   );
   private static final zi<ByteBuf, IntList> j = zg.g.a(zg.a()).a(IntArrayList::new, ArrayList::new);
   public static final zi<ByteBuf, czv> d = zi.a(czv.a.f, czv::a, j, czv::b, j, czv::c, zg.b, czv::d, zg.b, czv::e, czv::new);
   private static final xk k = xk.c("item.minecraft.firework_star.custom_color");

   @Override
   public void a(cxc.b $$0, Consumer<xk> $$1, cyy $$2) {
      this.a($$1);
      this.b($$1);
   }

   public void a(Consumer<xk> $$0) {
      $$0.accept(this.e.a().a(n.h));
   }

   public void b(Consumer<xk> $$0) {
      if (!this.f.isEmpty()) {
         $$0.accept(a(xk.i().a(n.h), this.f));
      }

      if (!this.g.isEmpty()) {
         $$0.accept(a(xk.c("item.minecraft.firework_star.fade_to").b(xj.v).a(n.h), this.g));
      }

      if (this.h) {
         $$0.accept(xk.c("item.minecraft.firework_star.trail").a(n.h));
      }

      if (this.i) {
         $$0.accept(xk.c("item.minecraft.firework_star.flicker").a(n.h));
      }
   }

   private static xk a(xy $$0, IntList $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1.getInt($$2)));
      }

      return $$0;
   }

   private static xk a(int $$0) {
      cwd $$1 = cwd.b($$0);
      return (xk)($$1 == null ? k : xk.c("item.minecraft.firework_star." + $$1.b()));
   }

   public czv a(IntList $$0) {
      return new czv(this.e, this.f, new IntArrayList($$0), this.h, this.i);
   }

   public czv.a a() {
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

   public static enum a implements baq {
      a(0, "small_ball"),
      b(1, "large_ball"),
      c(2, "star"),
      d(3, "creeper"),
      e(4, "burst");

      private static final IntFunction<czv.a> h = ayl.a(czv.a::b, values(), ayl.a.a);
      public static final zi<ByteBuf, czv.a> f = zg.a(h, czv.a::b);
      public static final Codec<czv.a> g = baq.b(czv.a::values);
      private final int i;
      private final String j;

      private a(final int $$0, final String $$1) {
         this.i = $$0;
         this.j = $$1;
      }

      public xy a() {
         return xk.c("item.minecraft.firework_star.shape." + this.j);
      }

      public int b() {
         return this.i;
      }

      public static czv.a a(int $$0) {
         return h.apply($$0);
      }

      @Override
      public String c() {
         return this.j;
      }
   }
}
