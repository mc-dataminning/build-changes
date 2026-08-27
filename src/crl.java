import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class crl extends crn {
   private final avt<crk> a;

   public crl(crn.a $$0, avt<crk> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public void a(crs $$0, @Nullable czg $$1, List<wi> $$2, cti $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<aju<crk>> $$4 = this.j($$0).flatMap(in::e);
      if ($$4.isPresent()) {
         ww $$5 = wi.c(ac.a("instrument", $$4.get().a()));
         $$2.add($$5.a(n.h));
      }
   }

   public static crs a(crn $$0, in<crk> $$1) {
      crs $$2 = new crs($$0);
      $$2.b(jr.G, $$1);
      return $$2;
   }

   public static void a(crs $$0, avt<crk> $$1, axt $$2) {
      Optional<in<crk>> $$3 = kt.am.a($$1, $$2);
      $$3.ifPresent($$1x -> $$0.b(jr.G, $$1x));
   }

   @Override
   public bog<crs> a(czg $$0, cka $$1, boe $$2) {
      crs $$3 = $$1.b($$2);
      in<crk> $$4 = $$3.a(jr.G);
      if ($$4 != null) {
         crk $$5 = $$4.a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gu().a(this, $$5.b());
         $$1.b(auz.c.b(this));
         return bog.b($$3);
      } else {
         return bog.d($$3);
      }
   }

   @Override
   public int b(crs $$0) {
      Optional<in<crk>> $$1 = this.j($$0);
      return $$1.<Integer>map($$0x -> ((crk)$$0x.a()).b()).orElse(0);
   }

   private Optional<in<crk>> j(crs $$0) {
      in<crk> $$1 = $$0.a(jr.G);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         Iterator<in<crk>> $$2 = kt.am.c(this.a).iterator();
         return $$2.hasNext() ? Optional.of($$2.next()) : Optional.empty();
      }
   }

   @Override
   public ctk c(crs $$0) {
      return ctk.i;
   }

   private static void a(czg $$0, cka $$1, crk $$2) {
      aun $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, aup.c, $$4, 1.0F);
      $$0.a(dub.B, $$1.dk(), dub.a.a($$1));
   }
}
