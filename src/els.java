import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class els extends elt {
   public static final MapCodec<els> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ayi.m.fieldOf("tries").orElse(128).forGetter($$0x -> $$0x.b),
               ayi.l.fieldOf("radius").orElse(2).forGetter($$0x -> $$0x.c),
               ayi.l.fieldOf("height").orElse(1).forGetter($$0x -> $$0x.d),
               ekz.a.fieldOf("block_state_provider").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, els::new)
   );
   private final int b;
   private final int c;
   private final int d;
   private final ekz e;

   public els(int $$0, int $$1, int $$2, ekz $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   protected elu<?> a() {
      return elu.i;
   }

   @Override
   public void a(elt.a $$0) {
      List<ji> $$1 = eig.a($$0);
      if (!$$1.isEmpty()) {
         ji $$2 = $$1.getFirst();
         int $$3 = $$2.v();
         int $$4 = $$2.u();
         int $$5 = $$2.u();
         int $$6 = $$2.w();
         int $$7 = $$2.w();

         for (ji $$8 : $$1) {
            if ($$8.v() == $$3) {
               $$4 = Math.min($$4, $$8.u());
               $$5 = Math.max($$5, $$8.u());
               $$6 = Math.min($$6, $$8.w());
               $$7 = Math.max($$7, $$8.w());
            }
         }

         azh $$9 = $$0.b();
         eob $$10 = new eob($$4, $$3, $$6, $$5, $$3, $$7).c(this.c, this.d, this.c);
         ji.a $$11 = new ji.a();

         for (int $$12 = 0; $$12 < this.b; $$12++) {
            $$11.d($$9.a($$10.h(), $$10.k()), $$9.a($$10.i(), $$10.l()), $$9.a($$10.j(), $$10.m()));
            this.a($$0, $$11);
         }
      }
   }

   private void a(elt.a $$0, ji $$1) {
      ji $$2 = $$1.d();
      if ((eig.d($$0.a(), $$2) || eig.b($$0.a(), $$2)) && eig.a($$0.a(), $$2.e()) && !$$0.a().b($$2, $$0x -> $$0x.b(etx.c))) {
         $$0.a($$2, this.e.a($$0.b(), $$1));
      }
   }
}
