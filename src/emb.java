import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class emb {
   private djr a;
   private dlh b;
   private iz c;
   private boolean d;
   @Nullable
   private ehx e;
   private boolean f;
   @Nullable
   private azc g;
   private int h;
   private final List<emc> i;
   private boolean j;
   private boolean k;

   public emb() {
      this.a = djr.a;
      this.b = dlh.a;
      this.c = iz.c;
      this.f = true;
      this.i = Lists.newArrayList();
   }

   public emb a() {
      emb $$0 = new emb();
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

   public emb a(djr $$0) {
      this.a = $$0;
      return this;
   }

   public emb a(dlh $$0) {
      this.b = $$0;
      return this;
   }

   public emb a(iz $$0) {
      this.c = $$0;
      return this;
   }

   public emb a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public emb a(ehx $$0) {
      this.e = $$0;
      return this;
   }

   public emb a(@Nullable azc $$0) {
      this.g = $$0;
      return this;
   }

   public emb b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public emb c(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public emb b() {
      this.i.clear();
      return this;
   }

   public emb a(emc $$0) {
      this.i.add($$0);
      return this;
   }

   public emb b(emc $$0) {
      this.i.remove($$0);
      return this;
   }

   public djr c() {
      return this.a;
   }

   public dlh d() {
      return this.b;
   }

   public iz e() {
      return this.c;
   }

   public azc b(@Nullable iz $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? azc.a(ac.c()) : azc.a(ayu.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public ehx g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<emc> i() {
      return this.i;
   }

   public boolean j() {
      return this.f;
   }

   public emf.a a(List<emf.a> $$0, @Nullable iz $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public emb d(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
