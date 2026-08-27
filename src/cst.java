import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class cst<T> extends AbstractIterator<T> {
   private final elo a;
   private final ely b;
   private final hz c;
   private final hx.a d;
   private final emm e;
   private final csz f;
   private final boolean g;
   @Nullable
   private csv h;
   private long i;
   private final BiFunction<hx.a, emm, T> j;

   public cst(csz $$0, @Nullable blv $$1, elo $$2, boolean $$3, BiFunction<hx.a, emm, T> $$4) {
      this.b = $$1 == null ? ely.a() : ely.a($$1);
      this.d = new hx.a();
      this.e = emj.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      this.j = $$4;
      int $$5 = auo.a($$2.a - 1.0E-7) - 1;
      int $$6 = auo.a($$2.d + 1.0E-7) + 1;
      int $$7 = auo.a($$2.b - 1.0E-7) - 1;
      int $$8 = auo.a($$2.e + 1.0E-7) + 1;
      int $$9 = auo.a($$2.c - 1.0E-7) - 1;
      int $$10 = auo.a($$2.f + 1.0E-7) + 1;
      this.c = new hz($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private csv a(int $$0, int $$1) {
      int $$2 = iz.a($$0);
      int $$3 = iz.a($$1);
      long $$4 = csw.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         csv $$5 = this.f.c($$2, $$3);
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
            csv $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               djh $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.o($$4, this.d)) && ($$3 != 1 || $$5.f()) && ($$3 != 2 || $$5.a(cws.bQ))) {
                  emm $$6 = $$5.b(this.f, this.d, this.b);
                  if ($$6 == emj.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a((double)$$0, (double)$$1, (double)$$2));
                     }
                  } else {
                     emm $$7 = $$6.a((double)$$0, (double)$$1, (double)$$2);
                     if (!$$7.c() && emj.c($$7, this.e, elx.i)) {
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
