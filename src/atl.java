import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class atl extends atc {
   private static final asy c = new asy(wx.c("dataPack.vanilla.description"), aa.b().a(asl.b), Optional.empty());
   private static final asf d = new asf(coo.h);
   private static final asb e = asb.a(asy.b, c, asf.a, d);
   private static final asi f = new asi("vanilla", wx.c("dataPack.vanilla.name"), atj.c, Optional.of(b));
   private static final ask g = new ask(false, atf.b.b, false);
   private static final ask h = new ask(false, atf.b.a, false);
   private static final akn i = new akn("minecraft", "datapacks");

   public atl(euc $$0) {
      super(asl.b, b(), i, $$0);
   }

   private static asi a(String $$0, wx $$1) {
      return new asi($$0, $$1, atj.d, Optional.of(ate.a($$0)));
   }

   @VisibleForTesting
   public static asn b() {
      return new aso().a(e).a("minecraft").b().a().a(f);
   }

   @Override
   protected wx a(String $$0) {
      return wx.b($$0);
   }

   @Nullable
   @Override
   protected atf a(asj $$0) {
      return atf.a(f, b($$0), asl.b, g);
   }

   @Nullable
   @Override
   protected atf a(String $$0, atf.c $$1, wx $$2) {
      return atf.a(a($$0, $$2), $$1, asl.b, h);
   }

   public static ati a(Path $$0, euc $$1) {
      return new ati(new atl($$1), new atd($$0, asl.b, atj.e, $$1));
   }

   public static ati c() {
      return new ati(new atl(new euc($$0 -> true)));
   }

   public static ati a(eox.c $$0) {
      return a($$0.a(eov.j), $$0.d().e());
   }
}
