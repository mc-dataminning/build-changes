import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cbs<T extends btb> extends cbz {
   private static final int i = 10;
   protected final Class<T> a;
   protected final int b;
   @Nullable
   protected btb c;
   protected cds d;

   public cbs(btd $$0, Class<T> $$1, boolean $$2) {
      this($$0, $$1, 10, $$2, false, null);
   }

   public cbs(btd $$0, Class<T> $$1, boolean $$2, Predicate<btb> $$3) {
      this($$0, $$1, 10, $$2, false, $$3);
   }

   public cbs(btd $$0, Class<T> $$1, boolean $$2, boolean $$3) {
      this($$0, $$1, 10, $$2, $$3, null);
   }

   public cbs(btd $$0, Class<T> $$1, int $$2, boolean $$3, boolean $$4, @Nullable Predicate<btb> $$5) {
      super($$0, $$3, $$4);
      this.a = $$1;
      this.b = b($$2);
      this.a(EnumSet.of(bzz.a.d));
      this.d = cds.a().a(this.l()).a($$5);
   }

   @Override
   public boolean a() {
      if (this.b > 0 && this.e.dT().a(this.b) != 0) {
         return false;
      } else {
         this.h();
         return this.c != null;
      }
   }

   protected ewa a(double $$0) {
      return this.e.cL().c($$0, 4.0, $$0);
   }

   protected void h() {
      if (this.a != cmk.class && this.a != aqn.class) {
         this.c = this.e.dQ().a(this.e.dQ().a(this.a, this.a(this.l()), $$0 -> true), this.d, this.e, this.e.dv(), this.e.dz(), this.e.dB());
      } else {
         this.c = this.e.dQ().a(this.d, this.e, this.e.dv(), this.e.dz(), this.e.dB());
      }
   }

   @Override
   public void c() {
      this.e.h(this.c);
      super.c();
   }

   public void a(@Nullable btb $$0) {
      this.c = $$0;
   }
}
