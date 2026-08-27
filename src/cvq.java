import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public record cvq(cvq.a e, IntList f, IntList g, boolean h, boolean i) implements cwd {
   public static final cvq a = new cvq(cvq.a.a, IntList.of(), IntList.of(), false, false);
   public static final Codec<IntList> b = Codec.INT.listOf().xmap(IntArrayList::new, ArrayList::new);
   public static final Codec<cvq> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cvq.a.g.fieldOf("shape").forGetter(cvq::a),
               axh.a(b, "colors", IntList.of()).forGetter(cvq::b),
               axh.a(b, "fade_colors", IntList.of()).forGetter(cvq::c),
               axh.a(Codec.BOOL, "has_trail", false).forGetter(cvq::d),
               axh.a(Codec.BOOL, "has_twinkle", false).forGetter(cvq::e)
            )
            .apply($$0, cvq::new)
   );
   private static final ys<ByteBuf, IntList> j = yq.e.a(yq.a()).a(IntArrayList::new, ArrayList::new);
   public static final ys<ByteBuf, cvq> d = ys.a(cvq.a.f, cvq::a, j, cvq::b, j, cvq::c, yq.b, cvq::d, yq.b, cvq::e, cvq::new);
   private static final wu k = wu.c("item.minecraft.firework_star.custom_color");

   @Override
   public void a(Consumer<wu> $$0, cuq $$1) {
      this.a($$0);
      this.b($$0);
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
      crs $$1 = crs.b($$0);
      return (wu)($$1 == null ? k : wu.c("item.minecraft.firework_star." + $$1.b()));
   }

   public cvq a(IntList $$0) {
      return new cvq(this.e, this.f, new IntArrayList($$0), this.h, this.i);
   }

   public cvq.a a() {
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

   public static enum a implements ayt {
      a(0, "small_ball"),
      b(1, "large_ball"),
      c(2, "star"),
      d(3, "creeper"),
      e(4, "burst");

      private static final IntFunction<cvq.a> h = awq.a(cvq.a::b, values(), awq.a.a);
      public static final ys<ByteBuf, cvq.a> f = yq.a(h, cvq.a::b);
      public static final Codec<cvq.a> g = ayt.b(cvq.a::values);
      private final int i;
      private final String j;

      private a(int $$0, String $$1) {
         this.i = $$0;
         this.j = $$1;
      }

      public xi a() {
         return wu.c("item.minecraft.firework_star.shape." + this.j);
      }

      public int b() {
         return this.i;
      }

      public static cvq.a a(int $$0) {
         return h.apply($$0);
      }

      @Override
      public String c() {
         return this.j;
      }
   }
}
