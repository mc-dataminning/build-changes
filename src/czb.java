import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public record czb(int d, boolean e) implements czq {
   private static final Codec<czb> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("rgb").forGetter(czb::a), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(czb::b)).apply($$0, czb::new)
   );
   public static final Codec<czb> a = Codec.withAlternative(f, Codec.INT, $$0 -> new czb($$0, true));
   public static final ym<ByteBuf, czb> b = ym.a(yk.g, czb::a, yk.b, czb::b, czb::new);
   public static final int c = -6265536;

   public static int a(cwn $$0, int $$1) {
      czb $$2 = $$0.a(kv.J);
      return $$2 != null ? axj.f($$2.a()) : $$1;
   }

   public static cwn a(cwn $$0, List<cvl> $$1) {
      if (!$$0.a(awx.bO)) {
         return cwn.j;
      } else {
         cwn $$2 = $$0.c(1);
         int $$3 = 0;
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;
         int $$7 = 0;
         czb $$8 = $$2.a(kv.J);
         if ($$8 != null) {
            int $$9 = axj.b($$8.a());
            int $$10 = axj.c($$8.a());
            int $$11 = axj.d($$8.a());
            $$6 += Math.max($$9, Math.max($$10, $$11));
            $$3 += $$9;
            $$4 += $$10;
            $$5 += $$11;
            $$7++;
         }

         for (cvl $$12 : $$1) {
            int $$13 = $$12.b().d();
            int $$14 = axj.b($$13);
            int $$15 = axj.c($$13);
            int $$16 = axj.d($$13);
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
         int $$22 = axj.a(0, $$17, $$18, $$19);
         boolean $$23 = $$8 == null || $$8.b();
         $$2.b(kv.J, new czb($$22, $$23));
         return $$2;
      }
   }

   @Override
   public void a(cwj.b $$0, Consumer<wo> $$1, cyf $$2) {
      if (this.e) {
         if ($$2.a()) {
            $$1.accept(wo.a("item.color", String.format(Locale.ROOT, "#%06X", this.d)).a(n.h));
         } else {
            $$1.accept(wo.c("item.dyed").a(n.h, n.u));
         }
      }
   }

   public czb a(boolean $$0) {
      return new czb(this.d, $$0);
   }

   public int a() {
      return this.d;
   }

   public boolean b() {
      return this.e;
   }
}
