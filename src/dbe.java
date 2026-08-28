import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class dbe<T> extends AbstractIterator<T> {
   private final evo a;
   private final evy b;
   private final jb c;
   private final iz.a d;
   private final ewm e;
   private final dbk f;
   private final boolean g;
   @Nullable
   private dbg h;
   private long i;
   private final BiFunction<iz.a, ewm, T> j;

   public dbe(dbk $$0, @Nullable bsw $$1, evo $$2, boolean $$3, BiFunction<iz.a, ewm, T> $$4) {
      this.b = $$1 == null ? evy.a() : evy.a($$1);
      this.d = new iz.a();
      this.e = ewj.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      this.j = $$4;
      int $$5 = ayz.a($$2.a - 1.0E-7) - 1;
      int $$6 = ayz.a($$2.d + 1.0E-7) + 1;
      int $$7 = ayz.a($$2.b - 1.0E-7) - 1;
      int $$8 = ayz.a($$2.e + 1.0E-7) + 1;
      int $$9 = ayz.a($$2.c - 1.0E-7) - 1;
      int $$10 = ayz.a($$2.f + 1.0E-7) + 1;
      this.c = new jb($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private dbg a(int $$0, int $$1) {
      int $$2 = kb.a($$0);
      int $$3 = kb.a($$1);
      long $$4 = dbh.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         dbg $$5 = this.f.c($$2, $$3);
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
            dbg $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               dse $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.o($$4, this.d)) && ($$3 != 1 || $$5.f()) && ($$3 != 2 || $$5.a(dfd.bQ))) {
                  ewm $$6 = $$5.b(this.f, this.d, this.b);
                  if ($$6 == ewj.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a((double)$$0, (double)$$1, (double)$$2));
                     }
                  } else {
                     ewm $$7 = $$6.a((double)$$0, (double)$$1, (double)$$2);
                     if (!$$7.c() && ewj.c($$7, this.e, evx.i)) {
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
