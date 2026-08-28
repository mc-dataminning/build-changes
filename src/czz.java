import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public record czz(czz.a e, IntList f, IntList g, boolean h, boolean i) implements dan {
   public static final czz a = new czz(czz.a.a, IntList.of(), IntList.of(), false, false);
   public static final Codec<IntList> b = Codec.INT.listOf().xmap(IntArrayList::new, ArrayList::new);
   public static final Codec<czz> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               czz.a.g.fieldOf("shape").forGetter(czz::a),
               b.optionalFieldOf("colors", IntList.of()).forGetter(czz::b),
               b.optionalFieldOf("fade_colors", IntList.of()).forGetter(czz::c),
               Codec.BOOL.optionalFieldOf("has_trail", false).forGetter(czz::d),
               Codec.BOOL.optionalFieldOf("has_twinkle", false).forGetter(czz::e)
            )
            .apply($$0, czz::new)
   );
   private static final zt<ByteBuf, IntList> j = zr.g.a(zr.a()).a(IntArrayList::new, ArrayList::new);
   public static final zt<ByteBuf, czz> d = zt.a(czz.a.f, czz::a, j, czz::b, j, czz::c, zr.b, czz::d, zr.b, czz::e, czz::new);
   private static final xv k = xv.c("item.minecraft.firework_star.custom_color");

   @Override
   public void a(cxg.b $$0, Consumer<xv> $$1, czc $$2) {
      this.a($$1);
      this.b($$1);
   }

   public void a(Consumer<xv> $$0) {
      $$0.accept(this.e.a().a(n.h));
   }

   public void b(Consumer<xv> $$0) {
      if (!this.f.isEmpty()) {
         $$0.accept(a(xv.i().a(n.h), this.f));
      }

      if (!this.g.isEmpty()) {
         $$0.accept(a(xv.c("item.minecraft.firework_star.fade_to").b(xu.v).a(n.h), this.g));
      }

      if (this.h) {
         $$0.accept(xv.c("item.minecraft.firework_star.trail").a(n.h));
      }

      if (this.i) {
         $$0.accept(xv.c("item.minecraft.firework_star.flicker").a(n.h));
      }
   }

   private static xv a(yj $$0, IntList $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1.getInt($$2)));
      }

      return $$0;
   }

   private static xv a(int $$0) {
      cwh $$1 = cwh.b($$0);
      return (xv)($$1 == null ? k : xv.c("item.minecraft.firework_star." + $$1.b()));
   }

   public czz a(IntList $$0) {
      return new czz(this.e, this.f, new IntArrayList($$0), this.h, this.i);
   }

   public czz.a a() {
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

   public static enum a implements bba {
      a(0, "small_ball"),
      b(1, "large_ball"),
      c(2, "star"),
      d(3, "creeper"),
      e(4, "burst");

      private static final IntFunction<czz.a> h = ayv.a(czz.a::b, values(), ayv.a.a);
      public static final zt<ByteBuf, czz.a> f = zr.a(h, czz.a::b);
      public static final Codec<czz.a> g = bba.b(czz.a::values);
      private final int i;
      private final String j;

      private a(final int $$0, final String $$1) {
         this.i = $$0;
         this.j = $$1;
      }

      public yj a() {
         return xv.c("item.minecraft.firework_star.shape." + this.j);
      }

      public int b() {
         return this.i;
      }

      public static czz.a a(int $$0) {
         return h.apply($$0);
      }

      @Override
      public String c() {
         return this.j;
      }
   }
}
