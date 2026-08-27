import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class ana extends ams {
   private static final amo b = new amo(tf.c("dataPack.vanilla.description"), aa.b().a(amb.b), Optional.empty());
   private static final alx c = new alx(cdx.g);
   private static final alv d = alv.a(amo.b, b, alx.a, c);
   private static final tf e = tf.c("dataPack.vanilla.name");
   private static final aer f = new aer("minecraft", "datapacks");

   public ana(egu $$0) {
      super(amb.b, b(), f, $$0);
   }

   @VisibleForTesting
   public static amd b() {
      return new ame().a(d).a("minecraft").b().a().c();
   }

   @Override
   protected tf a(String $$0) {
      return tf.b($$0);
   }

   @Nullable
   @Override
   protected amu a(ama $$0) {
      return amu.a("vanilla", e, false, b($$0), amb.b, amu.b.b, amy.c);
   }

   @Nullable
   @Override
   protected amu a(String $$0, amu.c $$1, tf $$2) {
      return amu.a($$0, $$2, false, $$1, amb.b, amu.b.a, amy.d);
   }

   public static amx a(Path $$0, egu $$1) {
      return new amx(new ana($$1), new amt($$0, amb.b, amy.e, $$1));
   }

   public static amx c() {
      return new amx(new ana(new egu($$0 -> true)));
   }

   public static amx a(ebx.c $$0) {
      return a($$0.a(ebv.j), $$0.a().e());
   }
}
