import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class emp extends emq {
   public static final MapCodec<emp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ays.m.fieldOf("tries").orElse(128).forGetter($$0x -> $$0x.b),
               ays.l.fieldOf("radius").orElse(2).forGetter($$0x -> $$0x.c),
               ays.l.fieldOf("height").orElse(1).forGetter($$0x -> $$0x.d),
               elw.a.fieldOf("block_state_provider").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, emp::new)
   );
   private final int b;
   private final int c;
   private final int d;
   private final elw e;

   public emp(int $$0, int $$1, int $$2, elw $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   protected emr<?> a() {
      return emr.i;
   }

   @Override
   public void a(emq.a $$0) {
      List<jj> $$1 = ejd.a($$0);
      if (!$$1.isEmpty()) {
         jj $$2 = $$1.getFirst();
         int $$3 = $$2.v();
         int $$4 = $$2.u();
         int $$5 = $$2.u();
         int $$6 = $$2.w();
         int $$7 = $$2.w();

         for (jj $$8 : $$1) {
            if ($$8.v() == $$3) {
               $$4 = Math.min($$4, $$8.u());
               $$5 = Math.max($$5, $$8.u());
               $$6 = Math.min($$6, $$8.w());
               $$7 = Math.max($$7, $$8.w());
            }
         }

         azs $$9 = $$0.b();
         eoy $$10 = new eoy($$4, $$3, $$6, $$5, $$3, $$7).c(this.c, this.d, this.c);
         jj.a $$11 = new jj.a();

         for (int $$12 = 0; $$12 < this.b; $$12++) {
            $$11.d($$9.a($$10.h(), $$10.k()), $$9.a($$10.i(), $$10.l()), $$9.a($$10.j(), $$10.m()));
            this.a($$0, $$11);
         }
      }
   }

   private void a(emq.a $$0, jj $$1) {
      jj $$2 = $$1.d();
      if (($$0.a().a($$1, dyl.a::l) || ejd.b($$0.a(), $$2)) && ejd.a($$0.a(), $$2.e()) && !$$0.a().b($$2, $$0x -> $$0x.b(euu.c))) {
         $$0.a($$2, this.e.a($$0.b(), $$1));
      }
   }
}
