import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cma extends cmc {
   private static final String a = "instrument";
   private final asg<clz> b;

   public cma(cmc.a $$0, asg<clz> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public void a(cmh $$0, @Nullable csy $$1, List<vb> $$2, cny $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<ags<clz>> $$4 = this.d($$0).flatMap(ie::e);
      if ($$4.isPresent()) {
         vp $$5 = vb.c(ac.a("instrument", $$4.get().a()));
         $$2.add($$5.a(n.h));
      }
   }

   public static cmh a(cmc $$0, ie<clz> $$1) {
      cmh $$2 = new cmh($$0);
      a($$2, $$1);
      return $$2;
   }

   public static void a(cmh $$0, asg<clz> $$1, auf $$2) {
      Optional<ie<clz>> $$3 = kb.an.b($$1).flatMap($$1x -> $$1x.a($$2));
      $$3.ifPresent($$1x -> a($$0, $$1x));
   }

   private static void a(cmh $$0, ie<clz> $$1) {
      sj $$2 = $$0.w();
      $$2.a("instrument", $$1.e().orElseThrow(() -> new IllegalStateException("Invalid instrument")).a().toString());
   }

   @Override
   public bjm<cmh> a(csy $$0, cer $$1, bjk $$2) {
      cmh $$3 = $$1.b($$2);
      Optional<? extends ie<clz>> $$4 = this.d($$3);
      if ($$4.isPresent()) {
         clz $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gn().a(this, $$5.b());
         $$1.b(arm.c.b(this));
         return bjm.b($$3);
      } else {
         return bjm.d($$3);
      }
   }

   @Override
   public int b(cmh $$0) {
      Optional<? extends ie<clz>> $$1 = this.d($$0);
      return $$1.<Integer>map($$0x -> ((clz)$$0x.a()).b()).orElse(0);
   }

   private Optional<? extends ie<clz>> d(cmh $$0) {
      sj $$1 = $$0.v();
      if ($$1 != null && $$1.b("instrument", 8)) {
         agt $$2 = agt.a($$1.l("instrument"));
         if ($$2 != null) {
            return kb.an.b(ags.a(kc.D, $$2));
         }
      }

      Iterator<ie<clz>> $$3 = kb.an.c(this.b).iterator();
      return $$3.hasNext() ? Optional.of($$3.next()) : Optional.empty();
   }

   @Override
   public coa c(cmh $$0) {
      return coa.i;
   }

   private static void a(csy $$0, cer $$1, clz $$2) {
      arb $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, ard.c, $$4, 1.0F);
      $$0.a(dmz.B, $$1.dk(), dmz.a.a($$1));
   }
}
