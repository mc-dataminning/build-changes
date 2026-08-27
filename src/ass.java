import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class ass extends asj {
   private static final asf c = new asf(wi.c("dataPack.vanilla.description"), aa.b().a(ars.b), Optional.empty());
   private static final arm d = new arm(cmp.h);
   private static final ari e = ari.a(asf.b, c, arm.a, d);
   private static final arp f = new arp("vanilla", wi.c("dataPack.vanilla.name"), asq.c, Optional.of(b));
   private static final arr g = new arr(false, asm.b.b, false);
   private static final arr h = new arr(false, asm.b.a, false);
   private static final ajv i = new ajv("minecraft", "datapacks");

   public ass(erz $$0) {
      super(ars.b, b(), i, $$0);
   }

   private static arp a(String $$0, wi $$1) {
      return new arp($$0, $$1, asq.d, Optional.of(asl.a($$0)));
   }

   @VisibleForTesting
   public static aru b() {
      return new arv().a(e).a("minecraft").b().a().a(f);
   }

   @Override
   protected wi a(String $$0) {
      return wi.b($$0);
   }

   @Nullable
   @Override
   protected asm a(arq $$0) {
      return asm.a(f, b($$0), ars.b, g);
   }

   @Nullable
   @Override
   protected asm a(String $$0, asm.c $$1, wi $$2) {
      return asm.a(a($$0, $$2), $$1, ars.b, h);
   }

   public static asp a(Path $$0, erz $$1) {
      return new asp(new ass($$1), new ask($$0, ars.b, asq.e, $$1));
   }

   public static asp c() {
      return new asp(new ass(new erz($$0 -> true)));
   }

   public static asp a(ena.c $$0) {
      return a($$0.a(emy.j), $$0.d().e());
   }
}
