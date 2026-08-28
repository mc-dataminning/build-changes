import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public record cws(cws.a e, IntList f, IntList g, boolean h, boolean i) implements cxf {
   public static final cws a = new cws(cws.a.a, IntList.of(), IntList.of(), false, false);
   public static final Codec<IntList> b = Codec.INT.listOf().xmap(IntArrayList::new, ArrayList::new);
   public static final Codec<cws> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cws.a.g.fieldOf("shape").forGetter(cws::a),
               b.optionalFieldOf("colors", IntList.of()).forGetter(cws::b),
               b.optionalFieldOf("fade_colors", IntList.of()).forGetter(cws::c),
               Codec.BOOL.optionalFieldOf("has_trail", false).forGetter(cws::d),
               Codec.BOOL.optionalFieldOf("has_twinkle", false).forGetter(cws::e)
            )
            .apply($$0, cws::new)
   );
   private static final ys<ByteBuf, IntList> j = yq.f.a(yq.a()).a(IntArrayList::new, ArrayList::new);
   public static final ys<ByteBuf, cws> d = ys.a(cws.a.f, cws::a, j, cws::b, j, cws::c, yq.b, cws::d, yq.b, cws::e, cws::new);
   private static final wu k = wu.c("item.minecraft.firework_star.custom_color");

   @Override
   public void a(ctv.b $$0, Consumer<wu> $$1, cvt $$2) {
      this.a($$1);
      this.b($$1);
   }

   public void a(Consumer<wu> $$0) {
      $$0.accept(this.e.a().a(n.h));
   }

   public void b(Consumer<wu> $$0) {
      if (!this.f.isEmpty()) {
         $$0.accept(a(wu.i().a(n.h), this.f));
      }

      if (!this.g.isEmpty()) {
         $$0.accept(a(wu.c("item.minecraft.firework_star.fade_to").b(wt.v).a(n.h), this.g));
      }

      if (this.h) {
         $$0.accept(wu.c("item.minecraft.firework_star.trail").a(n.h));
      }

      if (this.i) {
         $$0.accept(wu.c("item.minecraft.firework_star.flicker").a(n.h));
      }
   }

   private static wu a(xi $$0, IntList $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1.getInt($$2)));
      }

      return $$0;
   }

   private static wu a(int $$0) {
      cst $$1 = cst.b($$0);
      return (wu)($$1 == null ? k : wu.c("item.minecraft.firework_star." + $$1.b()));
   }

   public cws a(IntList $$0) {
      return new cws(this.e, this.f, new IntArrayList($$0), this.h, this.i);
   }

   public cws.a a() {
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

   public static enum a implements ayz {
      a(0, "small_ball"),
      b(1, "large_ball"),
      c(2, "star"),
      d(3, "creeper"),
      e(4, "burst");

      private static final IntFunction<cws.a> h = awu.a(cws.a::b, values(), awu.a.a);
      public static final ys<ByteBuf, cws.a> f = yq.a(h, cws.a::b);
      public static final Codec<cws.a> g = ayz.b(cws.a::values);
      private final int i;
      private final String j;

      private a(final int $$0, final String $$1) {
         this.i = $$0;
         this.j = $$1;
      }

      public xi a() {
         return wu.c("item.minecraft.firework_star.shape." + this.j);
      }

      public int b() {
         return this.i;
      }

      public static cws.a a(int $$0) {
         return h.apply($$0);
      }

      @Override
      public String c() {
         return this.j;
      }
   }
}
