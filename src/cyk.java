import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public record cyk(cyk.a e, IntList f, IntList g, boolean h, boolean i) implements cyy {
   public static final cyk a = new cyk(cyk.a.a, IntList.of(), IntList.of(), false, false);
   public static final Codec<IntList> b = Codec.INT.listOf().xmap(IntArrayList::new, ArrayList::new);
   public static final Codec<cyk> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cyk.a.g.fieldOf("shape").forGetter(cyk::a),
               b.optionalFieldOf("colors", IntList.of()).forGetter(cyk::b),
               b.optionalFieldOf("fade_colors", IntList.of()).forGetter(cyk::c),
               Codec.BOOL.optionalFieldOf("has_trail", false).forGetter(cyk::d),
               Codec.BOOL.optionalFieldOf("has_twinkle", false).forGetter(cyk::e)
            )
            .apply($$0, cyk::new)
   );
   private static final zf<ByteBuf, IntList> j = zd.g.a(zd.a()).a(IntArrayList::new, ArrayList::new);
   public static final zf<ByteBuf, cyk> d = zf.a(cyk.a.f, cyk::a, j, cyk::b, j, cyk::c, zd.b, cyk::d, zd.b, cyk::e, cyk::new);
   private static final xh k = xh.c("item.minecraft.firework_star.custom_color");

   @Override
   public void a(cvt.b $$0, Consumer<xh> $$1, cxp $$2) {
      this.a($$1);
      this.b($$1);
   }

   public void a(Consumer<xh> $$0) {
      $$0.accept(this.e.a().a(n.h));
   }

   public void b(Consumer<xh> $$0) {
      if (!this.f.isEmpty()) {
         $$0.accept(a(xh.i().a(n.h), this.f));
      }

      if (!this.g.isEmpty()) {
         $$0.accept(a(xh.c("item.minecraft.firework_star.fade_to").b(xg.v).a(n.h), this.g));
      }

      if (this.h) {
         $$0.accept(xh.c("item.minecraft.firework_star.trail").a(n.h));
      }

      if (this.i) {
         $$0.accept(xh.c("item.minecraft.firework_star.flicker").a(n.h));
      }
   }

   private static xh a(xv $$0, IntList $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1.getInt($$2)));
      }

      return $$0;
   }

   private static xh a(int $$0) {
      cuu $$1 = cuu.b($$0);
      return (xh)($$1 == null ? k : xh.c("item.minecraft.firework_star." + $$1.b()));
   }

   public cyk a(IntList $$0) {
      return new cyk(this.e, this.f, new IntArrayList($$0), this.h, this.i);
   }

   public cyk.a a() {
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

   public static enum a implements baf {
      a(0, "small_ball"),
      b(1, "large_ball"),
      c(2, "star"),
      d(3, "creeper"),
      e(4, "burst");

      private static final IntFunction<cyk.a> h = aya.a(cyk.a::b, values(), aya.a.a);
      public static final zf<ByteBuf, cyk.a> f = zd.a(h, cyk.a::b);
      public static final Codec<cyk.a> g = baf.b(cyk.a::values);
      private final int i;
      private final String j;

      private a(final int $$0, final String $$1) {
         this.i = $$0;
         this.j = $$1;
      }

      public xv a() {
         return xh.c("item.minecraft.firework_star.shape." + this.j);
      }

      public int b() {
         return this.i;
      }

      public static cyk.a a(int $$0) {
         return h.apply($$0);
      }

      @Override
      public String c() {
         return this.j;
      }
   }
}
