import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public record czd(int d, boolean e) implements czs {
   private static final Codec<czd> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("rgb").forGetter(czd::a), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(czd::b)).apply($$0, czd::new)
   );
   public static final Codec<czd> a = Codec.withAlternative(f, Codec.INT, $$0 -> new czd($$0, true));
   public static final yn<ByteBuf, czd> b = yn.a(yl.g, czd::a, yl.b, czd::b, czd::new);
   public static final int c = -6265536;

   public static int a(cwp $$0, int $$1) {
      czd $$2 = $$0.a(kv.J);
      return $$2 != null ? axk.f($$2.a()) : $$1;
   }

   public static cwp a(cwp $$0, List<cvn> $$1) {
      if (!$$0.a(awy.bO)) {
         return cwp.j;
      } else {
         cwp $$2 = $$0.c(1);
         int $$3 = 0;
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;
         int $$7 = 0;
         czd $$8 = $$2.a(kv.J);
         if ($$8 != null) {
            int $$9 = axk.b($$8.a());
            int $$10 = axk.c($$8.a());
            int $$11 = axk.d($$8.a());
            $$6 += Math.max($$9, Math.max($$10, $$11));
            $$3 += $$9;
            $$4 += $$10;
            $$5 += $$11;
            $$7++;
         }

         for (cvn $$12 : $$1) {
            int $$13 = $$12.b().d();
            int $$14 = axk.b($$13);
            int $$15 = axk.c($$13);
            int $$16 = axk.d($$13);
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
         int $$22 = axk.a(0, $$17, $$18, $$19);
         boolean $$23 = $$8 == null || $$8.b();
         $$2.b(kv.J, new czd($$22, $$23));
         return $$2;
      }
   }

   @Override
   public void a(cwl.b $$0, Consumer<wp> $$1, cyh $$2) {
      if (this.e) {
         if ($$2.a()) {
            $$1.accept(wp.a("item.color", String.format(Locale.ROOT, "#%06X", this.d)).a(n.h));
         } else {
            $$1.accept(wp.c("item.dyed").a(n.h, n.u));
         }
      }
   }

   public czd a(boolean $$0) {
      return new czd(this.d, $$0);
   }

   public int a() {
      return this.d;
   }

   public boolean b() {
      return this.e;
   }
}
