import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class ccs {
   public static final Codec<ccs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asq.i.fieldOf("ticks_since_last_warning").orElse(0).forGetter($$0x -> $$0x.g),
               asq.i.fieldOf("warning_level").orElse(0).forGetter($$0x -> $$0x.h),
               asq.i.fieldOf("cooldown_ticks").orElse(0).forGetter($$0x -> $$0x.i)
            )
            .apply($$0, ccs::new)
   );
   public static final int b = 4;
   private static final double c = 16.0;
   private static final int d = 48;
   private static final int e = 12000;
   private static final int f = 200;
   private int g;
   private int h;
   private int i;

   public ccs(int $$0, int $$1, int $$2) {
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

   public static OptionalInt a(ama $$0, ht $$1, amb $$2) {
      if (a($$0, $$1)) {
         return OptionalInt.empty();
      } else {
         List<amb> $$3 = b($$0, $$1);
         if (!$$3.contains($$2)) {
            $$3.add($$2);
         }

         if ($$3.stream().anyMatch($$0x -> $$0x.Y().map(ccs::d).orElse(false))) {
            return OptionalInt.empty();
         } else {
            Optional<ccs> $$4 = $$3.stream().flatMap($$0x -> $$0x.Y().stream()).max(Comparator.comparingInt(ccs::c));
            if ($$4.isPresent()) {
               ccs $$5 = $$4.get();
               $$5.e();
               $$3.forEach($$1x -> $$1x.Y().ifPresent($$1xx -> $$1xx.a($$5)));
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

   private static boolean a(ama $$0, ht $$1) {
      ejd $$2 = ejd.a(eji.b($$1), 48.0, 48.0, 48.0);
      return !$$0.a(ccq.class, $$2).isEmpty();
   }

   private static List<amb> b(ama $$0, ht $$1) {
      eji $$2 = eji.b($$1);
      Predicate<amb> $$3 = $$1x -> $$1x.dj().a((im)$$2, 16.0);
      return $$0.a($$3.and(bky::bv).and(bkl.f));
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
      this.h = ati.a($$0, 0, 4);
   }

   public int c() {
      return this.h;
   }

   private void a(ccs $$0) {
      this.h = $$0.h;
      this.i = $$0.i;
      this.g = $$0.g;
   }
}
