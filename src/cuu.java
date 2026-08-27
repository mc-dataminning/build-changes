import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public record cuu(cuu.a e, IntList f, IntList g, boolean h, boolean i) implements cvg {
   public static final cuu a = new cuu(cuu.a.a, IntList.of(), IntList.of(), false, false);
   public static final Codec<IntList> b = Codec.INT.listOf().xmap(IntArrayList::new, ArrayList::new);
   public static final Codec<cuu> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cuu.a.g.fieldOf("shape").forGetter(cuu::a),
               axe.a(b, "colors", IntList.of()).forGetter(cuu::b),
               axe.a(b, "fade_colors", IntList.of()).forGetter(cuu::c),
               axe.a(Codec.BOOL, "has_trail", false).forGetter(cuu::d),
               axe.a(Codec.BOOL, "has_twinkle", false).forGetter(cuu::e)
            )
            .apply($$0, cuu::new)
   );
   private static final yq<ByteBuf, IntList> j = yo.e.a(yo.a()).a(IntArrayList::new, ArrayList::new);
   public static final yq<ByteBuf, cuu> d = yq.a(cuu.a.f, cuu::a, j, cuu::b, j, cuu::c, yo.b, cuu::d, yo.b, cuu::e, cuu::new);
   private static final ws k = ws.c("item.minecraft.firework_star.custom_color");

   @Override
   public void a(Consumer<ws> $$0, ctu $$1) {
      this.a($$0);
      this.b($$0);
   }

   public void a(Consumer<ws> $$0) {
      $$0.accept(this.e.a().a(n.h));
   }

   public void b(Consumer<ws> $$0) {
      if (!this.f.isEmpty()) {
         $$0.accept(a(ws.i().a(n.h), this.f));
      }

      if (!this.g.isEmpty()) {
         $$0.accept(a(ws.c("item.minecraft.firework_star.fade_to").b(wr.v).a(n.h), this.g));
      }

      if (this.h) {
         $$0.accept(ws.c("item.minecraft.firework_star.trail").a(n.h));
      }

      if (this.i) {
         $$0.accept(ws.c("item.minecraft.firework_star.flicker").a(n.h));
      }
   }

   private static ws a(xg $$0, IntList $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1.getInt($$2)));
      }

      return $$0;
   }

   private static ws a(int $$0) {
      cqw $$1 = cqw.b($$0);
      return (ws)($$1 == null ? k : ws.c("item.minecraft.firework_star." + $$1.b()));
   }

   public cuu a(IntList $$0) {
      return new cuu(this.e, this.f, new IntArrayList($$0), this.h, this.i);
   }

   public cuu.a a() {
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

   public static enum a implements ayq {
      a(0, "small_ball"),
      b(1, "large_ball"),
      c(2, "star"),
      d(3, "creeper"),
      e(4, "burst");

      private static final IntFunction<cuu.a> h = awn.a(cuu.a::b, values(), awn.a.a);
      public static final yq<ByteBuf, cuu.a> f = yo.a(h, cuu.a::b);
      public static final Codec<cuu.a> g = ayq.b(cuu.a::values);
      private final int i;
      private final String j;

      private a(int $$0, String $$1) {
         this.i = $$0;
         this.j = $$1;
      }

      public xg a() {
         return ws.c("item.minecraft.firework_star.shape." + this.j);
      }

      public int b() {
         return this.i;
      }

      public static cuu.a a(int $$0) {
         return h.apply($$0);
      }

      @Override
      public String c() {
         return this.j;
      }
   }
}
