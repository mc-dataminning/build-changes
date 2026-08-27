import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class cda {
   public static final Codec<cda> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asu.i.fieldOf("ticks_since_last_warning").orElse(0).forGetter($$0x -> $$0x.g),
               asu.i.fieldOf("warning_level").orElse(0).forGetter($$0x -> $$0x.h),
               asu.i.fieldOf("cooldown_ticks").orElse(0).forGetter($$0x -> $$0x.i)
            )
            .apply($$0, cda::new)
   );
   public static final int b = 4;
   private static final double c = 16.0;
   private static final int d = 48;
   private static final int e = 12000;
   private static final int f = 200;
   private int g;
   private int h;
   private int i;

   public cda(int $$0, int $$1, int $$2) {
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

   public static OptionalInt a(ame $$0, ht $$1, amf $$2) {
      if (a($$0, $$1)) {
         return OptionalInt.empty();
      } else {
         List<amf> $$3 = b($$0, $$1);
         if (!$$3.contains($$2)) {
            $$3.add($$2);
         }

         if ($$3.stream().anyMatch($$0x -> $$0x.aa().map(cda::d).orElse(false))) {
            return OptionalInt.empty();
         } else {
            Optional<cda> $$4 = $$3.stream().flatMap($$0x -> $$0x.aa().stream()).max(Comparator.comparingInt(cda::c));
            if ($$4.isPresent()) {
               cda $$5 = $$4.get();
               $$5.e();
               $$3.forEach($$1x -> $$1x.aa().ifPresent($$1xx -> $$1xx.a($$5)));
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

   private static boolean a(ame $$0, ht $$1) {
      ejp $$2 = ejp.a(eju.b($$1), 48.0, 48.0, 48.0);
      return !$$0.a(ccy.class, $$2).isEmpty();
   }

   private static List<amf> b(ame $$0, ht $$1) {
      eju $$2 = eju.b($$1);
      Predicate<amf> $$3 = $$1x -> $$1x.dl().a((im)$$2, 16.0);
      return $$0.a($$3.and(blg::bx).and(bkt.f));
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
      this.h = atm.a($$0, 0, 4);
   }

   public int c() {
      return this.h;
   }

   private void a(cda $$0) {
      this.h = $$0.h;
      this.i = $$0.i;
      this.g = $$0.g;
   }
}
