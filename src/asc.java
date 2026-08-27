import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class asc extends art {
   private static final arp c = new arp(vu.c("dataPack.vanilla.description"), aa.b().a(arc.b), Optional.empty());
   private static final aqw d = new aqw(clj.h);
   private static final aqs e = aqs.a(arp.b, c, aqw.a, d);
   private static final aqz f = new aqz("vanilla", vu.c("dataPack.vanilla.name"), asa.c, Optional.of(b));
   private static final arb g = new arb(false, arw.b.b, false);
   private static final arb h = new arb(false, arw.b.a, false);
   private static final ajh i = new ajh("minecraft", "datapacks");

   public asc(epj $$0) {
      super(arc.b, b(), i, $$0);
   }

   private static aqz a(String $$0, vu $$1) {
      return new aqz($$0, $$1, asa.d, Optional.of(arv.a($$0)));
   }

   @VisibleForTesting
   public static are b() {
      return new arf().a(e).a("minecraft").b().a().a(f);
   }

   @Override
   protected vu a(String $$0) {
      return vu.b($$0);
   }

   @Nullable
   @Override
   protected arw a(ara $$0) {
      return arw.a(f, b($$0), arc.b, g);
   }

   @Nullable
   @Override
   protected arw a(String $$0, arw.c $$1, vu $$2) {
      return arw.a(a($$0, $$2), $$1, arc.b, h);
   }

   public static arz a(Path $$0, epj $$1) {
      return new arz(new asc($$1), new aru($$0, arc.b, asa.e, $$1));
   }

   public static arz c() {
      return new arz(new asc(new epj($$0 -> true)));
   }

   public static arz a(ekm.c $$0) {
      return a($$0.a(ekk.j), $$0.b().e());
   }
}
