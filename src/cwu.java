import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public record cwu(cwu.a e, IntList f, IntList g, boolean h, boolean i) implements cxh {
   public static final cwu a = new cwu(cwu.a.a, IntList.of(), IntList.of(), false, false);
   public static final Codec<IntList> b = Codec.INT.listOf().xmap(IntArrayList::new, ArrayList::new);
   public static final Codec<cwu> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cwu.a.g.fieldOf("shape").forGetter(cwu::a),
               b.optionalFieldOf("colors", IntList.of()).forGetter(cwu::b),
               b.optionalFieldOf("fade_colors", IntList.of()).forGetter(cwu::c),
               Codec.BOOL.optionalFieldOf("has_trail", false).forGetter(cwu::d),
               Codec.BOOL.optionalFieldOf("has_twinkle", false).forGetter(cwu::e)
            )
            .apply($$0, cwu::new)
   );
   private static final ys<ByteBuf, IntList> j = yq.f.a(yq.a()).a(IntArrayList::new, ArrayList::new);
   public static final ys<ByteBuf, cwu> d = ys.a(cwu.a.f, cwu::a, j, cwu::b, j, cwu::c, yq.b, cwu::d, yq.b, cwu::e, cwu::new);
   private static final wu k = wu.c("item.minecraft.firework_star.custom_color");

   @Override
   public void a(ctx.b $$0, Consumer<wu> $$1, cvv $$2) {
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
      csv $$1 = csv.b($$0);
      return (wu)($$1 == null ? k : wu.c("item.minecraft.firework_star." + $$1.b()));
   }

   public cwu a(IntList $$0) {
      return new cwu(this.e, this.f, new IntArrayList($$0), this.h, this.i);
   }

   public cwu.a a() {
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

   public static enum a implements azc {
      a(0, "small_ball"),
      b(1, "large_ball"),
      c(2, "star"),
      d(3, "creeper"),
      e(4, "burst");

      private static final IntFunction<cwu.a> h = aww.a(cwu.a::b, values(), aww.a.a);
      public static final ys<ByteBuf, cwu.a> f = yq.a(h, cwu.a::b);
      public static final Codec<cwu.a> g = azc.b(cwu.a::values);
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

      public static cwu.a a(int $$0) {
         return h.apply($$0);
      }

      @Override
      public String c() {
         return this.j;
      }
   }
}
