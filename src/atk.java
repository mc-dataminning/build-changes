import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class atk extends atb {
   private static final asx c = new asx(wu.c("dataPack.vanilla.description"), aa.b().a(ask.b), Optional.empty());
   private static final ase d = new ase(cpb.g);
   private static final asa e = asa.a(asx.b, c, ase.a, d);
   private static final ash f = new ash("vanilla", wu.c("dataPack.vanilla.name"), ati.c, Optional.of(b));
   private static final asj g = new asj(false, ate.b.b, false);
   private static final asj h = new asj(false, ate.b.a, false);
   private static final akk i = new akk("minecraft", "datapacks");

   public atk(evx $$0) {
      super(ask.b, b(), i, $$0);
   }

   private static ash a(String $$0, wu $$1) {
      return new ash($$0, $$1, ati.d, Optional.of(atd.a($$0)));
   }

   @VisibleForTesting
   public static asm b() {
      return new asn().a(e).a("minecraft").b().a().a(f);
   }

   @Override
   protected wu a(String $$0) {
      return wu.b($$0);
   }

   @Nullable
   @Override
   protected ate a(asi $$0) {
      return ate.a(f, b($$0), ask.b, g);
   }

   @Nullable
   @Override
   protected ate a(String $$0, ate.c $$1, wu $$2) {
      return ate.a(a($$0, $$2), $$1, ask.b, h);
   }

   public static ath a(Path $$0, evx $$1) {
      return new ath(new atk($$1), new atc($$0, ask.b, ati.e, $$1));
   }

   public static ath c() {
      return new ath(new atk(new evx($$0 -> true)));
   }

   public static ath a(eqk.c $$0) {
      return a($$0.a(eqi.j), $$0.d().e());
   }
}
