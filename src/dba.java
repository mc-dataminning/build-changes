import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class dba<T> extends AbstractIterator<T> {
   private final evk a;
   private final evu b;
   private final jb c;
   private final iz.a d;
   private final ewi e;
   private final dbg f;
   private final boolean g;
   @Nullable
   private dbc h;
   private long i;
   private final BiFunction<iz.a, ewi, T> j;

   public dba(dbg $$0, @Nullable bss $$1, evk $$2, boolean $$3, BiFunction<iz.a, ewi, T> $$4) {
      this.b = $$1 == null ? evu.a() : evu.a($$1);
      this.d = new iz.a();
      this.e = ewf.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      this.j = $$4;
      int $$5 = ayx.a($$2.a - 1.0E-7) - 1;
      int $$6 = ayx.a($$2.d + 1.0E-7) + 1;
      int $$7 = ayx.a($$2.b - 1.0E-7) - 1;
      int $$8 = ayx.a($$2.e + 1.0E-7) + 1;
      int $$9 = ayx.a($$2.c - 1.0E-7) - 1;
      int $$10 = ayx.a($$2.f + 1.0E-7) + 1;
      this.c = new jb($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private dbc a(int $$0, int $$1) {
      int $$2 = kb.a($$0);
      int $$3 = kb.a($$1);
      long $$4 = dbd.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         dbc $$5 = this.f.c($$2, $$3);
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
            dbc $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               dsa $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.o($$4, this.d)) && ($$3 != 1 || $$5.f()) && ($$3 != 2 || $$5.a(dez.bQ))) {
                  ewi $$6 = $$5.b(this.f, this.d, this.b);
                  if ($$6 == ewf.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a((double)$$0, (double)$$1, (double)$$2));
                     }
                  } else {
                     ewi $$7 = $$6.a((double)$$0, (double)$$1, (double)$$2);
                     if (!$$7.c() && ewf.c($$7, this.e, evt.i)) {
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
