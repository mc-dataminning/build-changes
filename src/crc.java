import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class crc extends cre {
   private final avr<crb> a;

   public crc(cre.a $$0, avr<crb> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public void a(crj $$0, @Nullable cyx $$1, List<wg> $$2, csz $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<ajs<crb>> $$4 = this.j($$0).flatMap(il::e);
      if ($$4.isPresent()) {
         wu $$5 = wg.c(ac.a("instrument", $$4.get().a()));
         $$2.add($$5.a(n.h));
      }
   }

   public static crj a(cre $$0, il<crb> $$1) {
      crj $$2 = new crj($$0);
      $$2.b(jp.G, $$1);
      return $$2;
   }

   public static void a(crj $$0, avr<crb> $$1, axr $$2) {
      Optional<il<crb>> $$3 = kr.an.a($$1, $$2);
      $$3.ifPresent($$1x -> $$0.b(jp.G, $$1x));
   }

   @Override
   public bob<crj> a(cyx $$0, cjt $$1, bnz $$2) {
      crj $$3 = $$1.b($$2);
      il<crb> $$4 = $$3.a(jp.G);
      if ($$4 != null) {
         crb $$5 = $$4.a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gu().a(this, $$5.b());
         $$1.b(auw.c.b(this));
         return bob.b($$3);
      } else {
         return bob.d($$3);
      }
   }

   @Override
   public int b(crj $$0) {
      Optional<il<crb>> $$1 = this.j($$0);
      return $$1.<Integer>map($$0x -> ((crb)$$0x.a()).b()).orElse(0);
   }

   private Optional<il<crb>> j(crj $$0) {
      il<crb> $$1 = $$0.a(jp.G);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         Iterator<il<crb>> $$2 = kr.an.c(this.a).iterator();
         return $$2.hasNext() ? Optional.of($$2.next()) : Optional.empty();
      }
   }

   @Override
   public ctb c(crj $$0) {
      return ctb.i;
   }

   private static void a(cyx $$0, cjt $$1, crb $$2) {
      aul $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, aun.c, $$4, 1.0F);
      $$0.a(dts.B, $$1.dk(), dts.a.a($$1));
   }
}
