import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class ddy<T> extends AbstractIterator<T> {
   private final ezc a;
   private final ezm b;
   private final ji c;
   private final jg.a d;
   private final fab e;
   private final dee f;
   private final boolean g;
   @Nullable
   private dea h;
   private long i;
   private final BiFunction<jg.a, fab, T> j;

   public ddy(dee $$0, @Nullable btz $$1, ezc $$2, boolean $$3, BiFunction<jg.a, fab, T> $$4) {
      this($$0, $$1 == null ? ezm.a() : ezm.a($$1), $$2, $$3, $$4);
   }

   public ddy(dee $$0, ezm $$1, ezc $$2, boolean $$3, BiFunction<jg.a, fab, T> $$4) {
      this.b = $$1;
      this.d = new jg.a();
      this.e = ezy.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      this.j = $$4;
      int $$5 = azj.a($$2.a - 1.0E-7) - 1;
      int $$6 = azj.a($$2.d + 1.0E-7) + 1;
      int $$7 = azj.a($$2.b - 1.0E-7) - 1;
      int $$8 = azj.a($$2.e + 1.0E-7) + 1;
      int $$9 = azj.a($$2.c - 1.0E-7) - 1;
      int $$10 = azj.a($$2.f + 1.0E-7) + 1;
      this.c = new ji($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private dea a(int $$0, int $$1) {
      int $$2 = ki.a($$0);
      int $$3 = ki.a($$1);
      long $$4 = deb.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         dea $$5 = this.f.c($$2, $$3);
         this.h = $$5;
         this.i = $$4;
         return $$5;
      }
   }

   protected T computeNext() {
      while (this.c.a()) {
         int $$0 = this.c.b();
         int $$1 = this.c.c();
         int $$2 = this.c.d();
         int $$3 = this.c.e();
         if ($$3 != 3) {
            dea $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               dvd $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.j($$4, this.d)) && ($$3 != 1 || $$5.i()) && ($$3 != 2 || $$5.a(dia.bQ))) {
                  fab $$6 = this.b.a($$5, this.f, this.d);
                  if ($$6 == ezy.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a((double)$$0, (double)$$1, (double)$$2));
                     }
                  } else {
                     fab $$7 = $$6.a((double)$$0, (double)$$1, (double)$$2);
                     if (!$$7.c() && ezy.c($$7, this.e, ezl.i)) {
                        return this.j.apply(this.d, $$7);
                     }
                  }
               }
            }
         }
      }

      return (T)this.endOfData();
   }
}
