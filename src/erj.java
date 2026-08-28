import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class erj {
   private dok a;
   private dqd b;
   private ji c;
   private boolean d;
   @Nullable
   private end e;
   private eqx f;
   @Nullable
   private azh g;
   private int h;
   private final List<erk> i;
   private boolean j;
   private boolean k;

   public erj() {
      this.a = dok.a;
      this.b = dqd.a;
      this.c = ji.c;
      this.f = eqx.b;
      this.i = Lists.newArrayList();
   }

   public erj a() {
      erj $$0 = new erj();
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

   public erj a(dok $$0) {
      this.a = $$0;
      return this;
   }

   public erj a(dqd $$0) {
      this.b = $$0;
      return this;
   }

   public erj a(ji $$0) {
      this.c = $$0;
      return this;
   }

   public erj a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public erj a(end $$0) {
      this.e = $$0;
      return this;
   }

   public erj a(@Nullable azh $$0) {
      this.g = $$0;
      return this;
   }

   public erj a(eqx $$0) {
      this.f = $$0;
      return this;
   }

   public erj b(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public erj b() {
      this.i.clear();
      return this;
   }

   public erj a(erk $$0) {
      this.i.add($$0);
      return this;
   }

   public erj b(erk $$0) {
      this.i.remove($$0);
      return this;
   }

   public dok c() {
      return this.a;
   }

   public dqd d() {
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
   public end g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<erk> i() {
      return this.i;
   }

   public boolean j() {
      return this.f == eqx.b;
   }

   public ern.b a(List<ern.b> $$0, @Nullable ji $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public erj c(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
