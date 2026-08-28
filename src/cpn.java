import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class cpn {
   public static final Codec<cpn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ays.l.fieldOf("ticks_since_last_warning").orElse(0).forGetter($$0x -> $$0x.g),
               ays.l.fieldOf("warning_level").orElse(0).forGetter($$0x -> $$0x.h),
               ays.l.fieldOf("cooldown_ticks").orElse(0).forGetter($$0x -> $$0x.i)
            )
            .apply($$0, cpn::new)
   );
   public static final int b = 4;
   private static final double c = 16.0;
   private static final int d = 48;
   private static final int e = 12000;
   private static final int f = 200;
   private int g;
   private int h;
   private int i;

   public cpn(int $$0, int $$1, int $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
   }

   public void a() {
      if (this.g >= 12000) {
         this.f();
         this.g = 0;
      } else {
         this.g++;
      }

      if (this.i > 0) {
         this.i--;
      }
   }

   public void b() {
      this.g = 0;
      this.h = 0;
      this.i = 0;
   }

   public static OptionalInt a(arn $$0, jj $$1, aro $$2) {
      if (a($$0, $$1)) {
         return OptionalInt.empty();
      } else {
         List<aro> $$3 = b($$0, $$1);
         if (!$$3.contains($$2)) {
            $$3.add($$2);
         }

         if ($$3.stream().anyMatch($$0x -> $$0x.ac().map(cpn::d).orElse(false))) {
            return OptionalInt.empty();
         } else {
            Optional<cpn> $$4 = $$3.stream().flatMap($$0x -> $$0x.ac().stream()).max(Comparator.comparingInt(cpn::c));
            if ($$4.isPresent()) {
               cpn $$5 = $$4.get();
               $$5.e();
               $$3.forEach($$1x -> $$1x.ac().ifPresent($$1xx -> $$1xx.a($$5)));
               return OptionalInt.of($$5.h);
            } else {
               return OptionalInt.empty();
            }
         }
      }
   }

   private boolean d() {
      return this.i > 0;
   }

   private static boolean a(arn $$0, jj $$1) {
      fcp $$2 = fcp.a(fcu.b($$1), 48.0, 48.0, 48.0);
      return !$$0.a(cpl.class, $$2).isEmpty();
   }

   private static List<aro> b(arn $$0, jj $$1) {
      fcu $$2 = fcu.b($$1);
      return $$0.a($$1x -> !$$1x.U_() && $$1x.dt().a((kc)$$2, 16.0) && $$1x.bK());
   }

   private void e() {
      if (!this.d()) {
         this.g = 0;
         this.i = 200;
         this.a(this.c() + 1);
      }
   }

   private void f() {
      this.a(this.c() - 1);
   }

   public void a(int $$0) {
      this.h = azk.a($$0, 0, 4);
   }

   public int c() {
      return this.h;
   }

   private void a(cpn $$0) {
      this.h = $$0.h;
      this.i = $$0.i;
      this.g = $$0.g;
   }
}
