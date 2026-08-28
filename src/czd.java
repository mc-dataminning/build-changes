import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public record czd(czd.a e, IntList f, IntList g, boolean h, boolean i) implements czr {
   public static final czd a = new czd(czd.a.a, IntList.of(), IntList.of(), false, false);
   public static final Codec<IntList> b = Codec.INT.listOf().xmap(IntArrayList::new, ArrayList::new);
   public static final Codec<czd> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               czd.a.g.fieldOf("shape").forGetter(czd::a),
               b.optionalFieldOf("colors", IntList.of()).forGetter(czd::b),
               b.optionalFieldOf("fade_colors", IntList.of()).forGetter(czd::c),
               Codec.BOOL.optionalFieldOf("has_trail", false).forGetter(czd::d),
               Codec.BOOL.optionalFieldOf("has_twinkle", false).forGetter(czd::e)
            )
            .apply($$0, czd::new)
   );
   private static final yn<ByteBuf, IntList> j = yl.g.a(yl.a()).a(IntArrayList::new, ArrayList::new);
   public static final yn<ByteBuf, czd> d = yn.a(czd.a.f, czd::a, j, czd::b, j, czd::c, yl.b, czd::d, yl.b, czd::e, czd::new);
   private static final wp k = wp.c("item.minecraft.firework_star.custom_color");

   @Override
   public void a(cwk.b $$0, Consumer<wp> $$1, cyg $$2) {
      this.a($$1);
      this.b($$1);
   }

   public void a(Consumer<wp> $$0) {
      $$0.accept(this.e.a().a(n.h));
   }

   public void b(Consumer<wp> $$0) {
      if (!this.f.isEmpty()) {
         $$0.accept(a(wp.i().a(n.h), this.f));
      }

      if (!this.g.isEmpty()) {
         $$0.accept(a(wp.c("item.minecraft.firework_star.fade_to").b(wo.v).a(n.h), this.g));
      }

      if (this.h) {
         $$0.accept(wp.c("item.minecraft.firework_star.trail").a(n.h));
      }

      if (this.i) {
         $$0.accept(wp.c("item.minecraft.firework_star.flicker").a(n.h));
      }
   }

   private static wp a(xd $$0, IntList $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1.getInt($$2)));
      }

      return $$0;
   }

   private static wp a(int $$0) {
      cvl $$1 = cvl.b($$0);
      return (wp)($$1 == null ? k : wp.c("item.minecraft.firework_star." + $$1.b()));
   }

   public czd a(IntList $$0) {
      return new czd(this.e, this.f, new IntArrayList($$0), this.h, this.i);
   }

   public czd.a a() {
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

   public static enum a implements azv {
      a(0, "small_ball"),
      b(1, "large_ball"),
      c(2, "star"),
      d(3, "creeper"),
      e(4, "burst");

      private static final IntFunction<czd.a> h = axq.a(czd.a::b, values(), axq.a.a);
      public static final yn<ByteBuf, czd.a> f = yl.a(h, czd.a::b);
      public static final Codec<czd.a> g = azv.b(czd.a::values);
      private final int i;
      private final String j;

      private a(final int $$0, final String $$1) {
         this.i = $$0;
         this.j = $$1;
      }

      public xd a() {
         return wp.c("item.minecraft.firework_star.shape." + this.j);
      }

      public int b() {
         return this.i;
      }

      public static czd.a a(int $$0) {
         return h.apply($$0);
      }

      @Override
      public String c() {
         return this.j;
      }
   }
}
