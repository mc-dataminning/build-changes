import com.mojang.serialization.Codec;
import java.util.Optional;

public record dbx(cxz<dhl> c) {
   public static final Codec<dbx> a = cxz.a(mg.bj, dhl.c).xmap(dbx::new, dbx::a);
   public static final yw<wj, dbx> b = cxz.a(mg.bj, dhl.d).a(dbx::new, dbx::a);

   public dbx(je<dhl> $$0) {
      this(new cxz<>($$0));
   }

   @Deprecated
   public dbx(alf<dhl> $$0) {
      this(new cxz<>($$0));
   }

   public Optional<je<dhl>> a(jg.a $$0) {
      return this.c.a($$0);
   }

   public cxz<dhl> a() {
      return this.c;
   }
}
