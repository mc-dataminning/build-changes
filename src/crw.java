import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class crw extends cry {
   private final awd<crv> a;

   public crw(cry.a $$0, awd<crv> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public void a(csd $$0, @Nullable czu $$1, List<ws> $$2, ctu $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<ake<crv>> $$4 = this.j($$0).flatMap(iv::e);
      if ($$4.isPresent()) {
         xg $$5 = ws.c(ac.a("instrument", $$4.get().a()));
         $$2.add($$5.a(n.h));
      }
   }

   public static csd a(cry $$0, iv<crv> $$1) {
      csd $$2 = new csd($$0);
      $$2.b(jz.G, $$1);
      return $$2;
   }

   public static void a(csd $$0, awd<crv> $$1, ayd $$2) {
      Optional<iv<crv>> $$3 = lc.am.a($$1, $$2);
      $$3.ifPresent($$1x -> $$0.b(jz.G, $$1x));
   }

   @Override
   public bor<csd> a(czu $$0, ckl $$1, bop $$2) {
      csd $$3 = $$1.b($$2);
      iv<crv> $$4 = $$3.a(jz.G);
      if ($$4 != null) {
         crv $$5 = $$4.a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gv().a(this, $$5.b());
         $$1.b(avj.c.b(this));
         return bor.b($$3);
      } else {
         return bor.d($$3);
      }
   }

   @Override
   public int b(csd $$0) {
      Optional<iv<crv>> $$1 = this.j($$0);
      return $$1.<Integer>map($$0x -> ((crv)$$0x.a()).b()).orElse(0);
   }

   private Optional<iv<crv>> j(csd $$0) {
      iv<crv> $$1 = $$0.a(jz.G);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         Iterator<iv<crv>> $$2 = lc.am.c(this.a).iterator();
         return $$2.hasNext() ? Optional.of($$2.next()) : Optional.empty();
      }
   }

   @Override
   public ctw c(csd $$0) {
      return ctw.i;
   }

   private static void a(czu $$0, ckl $$1, crv $$2) {
      auy $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, ava.c, $$4, 1.0F);
      $$0.a(dur.B, $$1.dl(), dur.a.a($$1));
   }
}
