import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpi extends dic {
   public static final MapCodec<dpi> a = b(dpi::new);
   public static final dwm b = dwl.E;
   private final brp c = brm.a(5);

   @Override
   public MapCodec<dpi> a() {
      return a;
   }

   public dpi(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dsy a(jh $$0, dvv $$1) {
      return new dug($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsy> dsz<T> a(dfm $$0, dvv $$1, dta<T> $$2) {
      return $$0.C ? null : a($$2, dta.K, dug::a);
   }

   @Override
   protected dow a_(dvv $$0) {
      return dow.c;
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, cwm $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
