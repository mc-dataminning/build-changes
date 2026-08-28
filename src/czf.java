import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public record czf(czf.a e, IntList f, IntList g, boolean h, boolean i) implements czt {
   public static final czf a = new czf(czf.a.a, IntList.of(), IntList.of(), false, false);
   public static final Codec<IntList> b = Codec.INT.listOf().xmap(IntArrayList::new, ArrayList::new);
   public static final Codec<czf> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               czf.a.g.fieldOf("shape").forGetter(czf::a),
               b.optionalFieldOf("colors", IntList.of()).forGetter(czf::b),
               b.optionalFieldOf("fade_colors", IntList.of()).forGetter(czf::c),
               Codec.BOOL.optionalFieldOf("has_trail", false).forGetter(czf::d),
               Codec.BOOL.optionalFieldOf("has_twinkle", false).forGetter(czf::e)
            )
            .apply($$0, czf::new)
   );
   private static final yn<ByteBuf, IntList> j = yl.g.a(yl.a()).a(IntArrayList::new, ArrayList::new);
   public static final yn<ByteBuf, czf> d = yn.a(czf.a.f, czf::a, j, czf::b, j, czf::c, yl.b, czf::d, yl.b, czf::e, czf::new);
   private static final wp k = wp.c("item.minecraft.firework_star.custom_color");

   @Override
   public void a(cwm.b $$0, Consumer<wp> $$1, cyi $$2) {
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
      cvn $$1 = cvn.b($$0);
      return (wp)($$1 == null ? k : wp.c("item.minecraft.firework_star." + $$1.b()));
   }

   public czf a(IntList $$0) {
      return new czf(this.e, this.f, new IntArrayList($$0), this.h, this.i);
   }

   public czf.a a() {
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

      private static final IntFunction<czf.a> h = axq.a(czf.a::b, values(), axq.a.a);
      public static final yn<ByteBuf, czf.a> f = yl.a(h, czf.a::b);
      public static final Codec<czf.a> g = azv.b(czf.a::values);
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

      public static czf.a a(int $$0) {
         return h.apply($$0);
      }

      @Override
      public String c() {
         return this.j;
      }
   }
}
