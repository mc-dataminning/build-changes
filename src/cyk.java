import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public record cyk(int d, boolean e) implements cyz {
   private static final Codec<cyk> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("rgb").forGetter(cyk::a), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cyk::b)).apply($$0, cyk::new)
   );
   public static final Codec<cyk> a = Codec.withAlternative(f, Codec.INT, $$0 -> new cyk($$0, true));
   public static final zc<ByteBuf, cyk> b = zc.a(za.g, cyk::a, za.b, cyk::b, cyk::new);
   public static final int c = -6265536;

   public static int a(cvs $$0, int $$1) {
      cyk $$2 = $$0.a(ks.E);
      return $$2 != null ? axq.f($$2.a()) : $$1;
   }

   public static cvs a(cvs $$0, List<cun> $$1) {
      if (!$$0.a(axe.bD)) {
         return cvs.k;
      } else {
         cvs $$2 = $$0.c(1);
         int $$3 = 0;
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;
         int $$7 = 0;
         cyk $$8 = $$2.a(ks.E);
         if ($$8 != null) {
            int $$9 = axq.b($$8.a());
            int $$10 = axq.c($$8.a());
            int $$11 = axq.d($$8.a());
            $$6 += Math.max($$9, Math.max($$10, $$11));
            $$3 += $$9;
            $$4 += $$10;
            $$5 += $$11;
            $$7++;
         }

         for (cun $$12 : $$1) {
            int $$13 = $$12.c().d();
            int $$14 = axq.b($$13);
            int $$15 = axq.c($$13);
            int $$16 = axq.d($$13);
            $$6 += Math.max($$14, Math.max($$15, $$16));
            $$3 += $$14;
            $$4 += $$15;
            $$5 += $$16;
            $$7++;
         }

         int $$17 = $$3 / $$7;
         int $$18 = $$4 / $$7;
         int $$19 = $$5 / $$7;
         float $$20 = (float)$$6 / (float)$$7;
         float $$21 = (float)Math.max($$17, Math.max($$18, $$19));
         $$17 = (int)((float)$$17 * $$20 / $$21);
         $$18 = (int)((float)$$18 * $$20 / $$21);
         $$19 = (int)((float)$$19 * $$20 / $$21);
         int $$22 = axq.a(0, $$17, $$18, $$19);
         boolean $$23 = $$8 == null || $$8.b();
         $$2.b(ks.E, new cyk($$22, $$23));
         return $$2;
      }
   }

   @Override
   public void a(cvn.b $$0, Consumer<xe> $$1, cxk $$2) {
      if (this.e) {
         if ($$2.a()) {
            $$1.accept(xe.a("item.color", String.format(Locale.ROOT, "#%06X", this.d)).a(n.h));
         } else {
            $$1.accept(xe.c("item.dyed").a(n.h, n.u));
         }
      }
   }

   public cyk a(boolean $$0) {
      return new cyk(this.d, $$0);
   }

   public int a() {
      return this.d;
   }

   public boolean b() {
      return this.e;
   }
}
