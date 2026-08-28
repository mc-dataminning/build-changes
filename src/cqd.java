import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class cqd {
   public static final Codec<cqd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayu.l.fieldOf("ticks_since_last_warning").orElse(0).forGetter($$0x -> $$0x.g),
               ayu.l.fieldOf("warning_level").orElse(0).forGetter($$0x -> $$0x.h),
               ayu.l.fieldOf("cooldown_ticks").orElse(0).forGetter($$0x -> $$0x.i)
            )
            .apply($$0, cqd::new)
   );
   public static final int b = 4;
   private static final double c = 16.0;
   private static final int d = 48;
   private static final int e = 12000;
   private static final int f = 200;
   private int g;
   private int h;
   private int i;

   public cqd(int $$0, int $$1, int $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
   }

   public cqd() {
      this(0, 0, 0);
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

   public static OptionalInt a(arq $$0, iu $$1, arr $$2) {
      if (a($$0, $$1)) {
         return OptionalInt.empty();
      } else {
         List<arr> $$3 = b($$0, $$1);
         if (!$$3.contains($$2)) {
            $$3.add($$2);
         }

         if ($$3.stream().anyMatch($$0x -> $$0x.ac().map(cqd::d).orElse(false))) {
            return OptionalInt.empty();
         } else {
            Optional<cqd> $$4 = $$3.stream().flatMap($$0x -> $$0x.ac().stream()).max(Comparator.comparingInt(cqd::c));
            if ($$4.isPresent()) {
               cqd $$5 = $$4.get();
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

   private static boolean a(arq $$0, iu $$1) {
      fed $$2 = fed.a(fei.b($$1), 48.0, 48.0, 48.0);
      return !$$0.a(cqb.class, $$2).isEmpty();
   }

   private static List<arr> b(arq $$0, iu $$1) {
      fei $$2 = fei.b($$1);
      return $$0.a($$1x -> !$$1x.U_() && $$1x.dt().a((jo)$$2, 16.0) && $$1x.bK());
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
      this.h = azm.a($$0, 0, 4);
   }

   public int c() {
      return this.h;
   }

   private void a(cqd $$0) {
      this.h = $$0.h;
      this.i = $$0.i;
      this.g = $$0.g;
   }
}
