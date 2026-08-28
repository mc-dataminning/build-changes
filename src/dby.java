import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public record dby(dby.a e, IntList f, IntList g, boolean h, boolean i) implements dcp {
   public static final dby a = new dby(dby.a.a, IntList.of(), IntList.of(), false, false);
   public static final Codec<IntList> b = Codec.INT.listOf().xmap(IntArrayList::new, ArrayList::new);
   public static final Codec<dby> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dby.a.g.fieldOf("shape").forGetter(dby::a),
               b.optionalFieldOf("colors", IntList.of()).forGetter(dby::b),
               b.optionalFieldOf("fade_colors", IntList.of()).forGetter(dby::c),
               Codec.BOOL.optionalFieldOf("has_trail", false).forGetter(dby::d),
               Codec.BOOL.optionalFieldOf("has_twinkle", false).forGetter(dby::e)
            )
            .apply($$0, dby::new)
   );
   private static final yw<ByteBuf, IntList> j = yu.g.a(yu.a()).a(IntArrayList::new, ArrayList::new);
   public static final yw<ByteBuf, dby> d = yw.a(dby.a.f, dby::a, j, dby::b, j, dby::c, yu.b, dby::d, yu.b, dby::e, dby::new);
   private static final wy k = wy.c("item.minecraft.firework_star.custom_color");

   @Override
   public void a(czg.b $$0, Consumer<wy> $$1, daz $$2, kf $$3) {
      $$1.accept(this.e.a().a(o.h));
      this.a($$1);
   }

   public void a(Consumer<wy> $$0) {
      if (!this.f.isEmpty()) {
         $$0.accept(a(wy.i().a(o.h), this.f));
      }

      if (!this.g.isEmpty()) {
         $$0.accept(a(wy.c("item.minecraft.firework_star.fade_to").b(wx.v).a(o.h), this.g));
      }

      if (this.h) {
         $$0.accept(wy.c("item.minecraft.firework_star.trail").a(o.h));
      }

      if (this.i) {
         $$0.accept(wy.c("item.minecraft.firework_star.flicker").a(o.h));
      }
   }

   private static wy a(xm $$0, IntList $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1.getInt($$2)));
      }

      return $$0;
   }

   private static wy a(int $$0) {
      cyi $$1 = cyi.b($$0);
      return (wy)($$1 == null ? k : wy.c("item.minecraft.firework_star." + $$1.b()));
   }

   public dby a(IntList $$0) {
      return new dby(this.e, this.f, new IntArrayList($$0), this.h, this.i);
   }

   public dby.a a() {
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

   public static enum a implements bak {
      a(0, "small_ball"),
      b(1, "large_ball"),
      c(2, "star"),
      d(3, "creeper"),
      e(4, "burst");

      private static final IntFunction<dby.a> h = ayc.a(dby.a::b, values(), ayc.a.a);
      public static final yw<ByteBuf, dby.a> f = yu.a(h, dby.a::b);
      public static final Codec<dby.a> g = bak.b(dby.a::values);
      private final int i;
      private final String j;

      private a(final int $$0, final String $$1) {
         this.i = $$0;
         this.j = $$1;
      }

      public xm a() {
         return wy.c("item.minecraft.firework_star.shape." + this.j);
      }

      public int b() {
         return this.i;
      }

      public static dby.a a(int $$0) {
         return h.apply($$0);
      }

      @Override
      public String c() {
         return this.j;
      }
   }
}
