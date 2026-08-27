import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class asq extends ash {
   private static final asd c = new asd(wg.c("dataPack.vanilla.description"), aa.b().a(arq.b), Optional.empty());
   private static final ark d = new ark(cmi.h);
   private static final arg e = arg.a(asd.b, c, ark.a, d);
   private static final arn f = new arn("vanilla", wg.c("dataPack.vanilla.name"), aso.c, Optional.of(b));
   private static final arp g = new arp(false, ask.b.b, false);
   private static final arp h = new arp(false, ask.b.a, false);
   private static final ajt i = new ajt("minecraft", "datapacks");

   public asq(erq $$0) {
      super(arq.b, b(), i, $$0);
   }

   private static arn a(String $$0, wg $$1) {
      return new arn($$0, $$1, aso.d, Optional.of(asj.a($$0)));
   }

   @VisibleForTesting
   public static ars b() {
      return new art().a(e).a("minecraft").b().a().a(f);
   }

   @Override
   protected wg a(String $$0) {
      return wg.b($$0);
   }

   @Nullable
   @Override
   protected ask a(aro $$0) {
      return ask.a(f, b($$0), arq.b, g);
   }

   @Nullable
   @Override
   protected ask a(String $$0, ask.c $$1, wg $$2) {
      return ask.a(a($$0, $$2), $$1, arq.b, h);
   }

   public static asn a(Path $$0, erq $$1) {
      return new asn(new asq($$1), new asi($$0, arq.b, aso.e, $$1));
   }

   public static asn c() {
      return new asn(new asq(new erq($$0 -> true)));
   }

   public static asn a(emr.c $$0) {
      return a($$0.a(emp.j), $$0.d().e());
   }
}
