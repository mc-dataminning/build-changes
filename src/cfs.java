import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cfs extends cfu {
   private static final String a = "instrument";
   private final anl<cfr> b;

   public cfs(cfu.a $$0, anl<cfr> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public void a(cfz $$0, @Nullable cmm $$1, List<sw> $$2, chq $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<acp<cfr>> $$4 = this.d($$0).flatMap(he::e);
      if ($$4.isPresent()) {
         tj $$5 = sw.c(ac.a("instrument", $$4.get().a()));
         $$2.add($$5.a(n.h));
      }
   }

   public static cfz a(cfu $$0, he<cfr> $$1) {
      cfz $$2 = new cfz($$0);
      a($$2, $$1);
      return $$2;
   }

   public static void a(cfz $$0, anl<cfr> $$1, apf $$2) {
      Optional<he<cfr>> $$3 = jb.am.b($$1).flatMap($$1x -> $$1x.a($$2));
      $$3.ifPresent($$1x -> a($$0, $$1x));
   }

   private static void a(cfz $$0, he<cfr> $$1) {
      qr $$2 = $$0.w();
      $$2.a("instrument", $$1.e().orElseThrow(() -> new IllegalStateException("Invalid instrument")).a().toString());
   }

   @Override
   public bdy<cfz> a(cmm $$0, byo $$1, bdw $$2) {
      cfz $$3 = $$1.b($$2);
      Optional<? extends he<cfr>> $$4 = this.d($$3);
      if ($$4.isPresent()) {
         cfr $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gi().a(this, $$5.b());
         $$1.b(amr.c.b(this));
         return bdy.b($$3);
      } else {
         return bdy.d($$3);
      }
   }

   @Override
   public int b(cfz $$0) {
      Optional<? extends he<cfr>> $$1 = this.d($$0);
      return $$1.<Integer>map($$0x -> ((cfr)$$0x.a()).b()).orElse(0);
   }

   private Optional<? extends he<cfr>> d(cfz $$0) {
      qr $$1 = $$0.v();
      if ($$1 != null && $$1.b("instrument", 8)) {
         acq $$2 = acq.a($$1.l("instrument"));
         if ($$2 != null) {
            return jb.am.b(acp.a(jc.B, $$2));
         }
      }

      Iterator<he<cfr>> $$3 = jb.am.c(this.b).iterator();
      return $$3.hasNext() ? Optional.of($$3.next()) : Optional.empty();
   }

   @Override
   public chs c(cfz $$0) {
      return chs.i;
   }

   private static void a(cmm $$0, byo $$1, cfr $$2) {
      amg $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, ami.c, $$4, 1.0F);
      $$0.a(dgl.C, $$1.dg(), dgl.a.a($$1));
   }
}
