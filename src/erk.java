import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class erk {
   private dol a;
   private dqe b;
   private ji c;
   private boolean d;
   @Nullable
   private ene e;
   private eqy f;
   @Nullable
   private azh g;
   private int h;
   private final List<erl> i;
   private boolean j;
   private boolean k;

   public erk() {
      this.a = dol.a;
      this.b = dqe.a;
      this.c = ji.c;
      this.f = eqy.b;
      this.i = Lists.newArrayList();
   }

   public erk a() {
      erk $$0 = new erk();
      $$0.a = this.a;
      $$0.b = this.b;
      $$0.c = this.c;
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      $$0.g = this.g;
      $$0.h = this.h;
      $$0.i.addAll(this.i);
      $$0.j = this.j;
      $$0.k = this.k;
      return $$0;
   }

   public erk a(dol $$0) {
      this.a = $$0;
      return this;
   }

   public erk a(dqe $$0) {
      this.b = $$0;
      return this;
   }

   public erk a(ji $$0) {
      this.c = $$0;
      return this;
   }

   public erk a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public erk a(ene $$0) {
      this.e = $$0;
      return this;
   }

   public erk a(@Nullable azh $$0) {
      this.g = $$0;
      return this;
   }

   public erk a(eqy $$0) {
      this.f = $$0;
      return this;
   }

   public erk b(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public erk b() {
      this.i.clear();
      return this;
   }

   public erk a(erl $$0) {
      this.i.add($$0);
      return this;
   }

   public erk b(erl $$0) {
      this.i.remove($$0);
      return this;
   }

   public dol c() {
      return this.a;
   }

   public dqe d() {
      return this.b;
   }

   public ji e() {
      return this.c;
   }

   public azh b(@Nullable ji $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? azh.a(af.c()) : azh.a(ayz.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public ene g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<erl> i() {
      return this.i;
   }

   public boolean j() {
      return this.f == eqy.b;
   }

   public ero.b a(List<ero.b> $$0, @Nullable ji $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public erk c(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
