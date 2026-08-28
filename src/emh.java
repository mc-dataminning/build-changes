import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class emh {
   private djx a;
   private dln b;
   private iz c;
   private boolean d;
   @Nullable
   private eid e;
   private boolean f;
   @Nullable
   private azh g;
   private int h;
   private final List<emi> i;
   private boolean j;
   private boolean k;

   public emh() {
      this.a = djx.a;
      this.b = dln.a;
      this.c = iz.c;
      this.f = true;
      this.i = Lists.newArrayList();
   }

   public emh a() {
      emh $$0 = new emh();
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

   public emh a(djx $$0) {
      this.a = $$0;
      return this;
   }

   public emh a(dln $$0) {
      this.b = $$0;
      return this;
   }

   public emh a(iz $$0) {
      this.c = $$0;
      return this;
   }

   public emh a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public emh a(eid $$0) {
      this.e = $$0;
      return this;
   }

   public emh a(@Nullable azh $$0) {
      this.g = $$0;
      return this;
   }

   public emh b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public emh c(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public emh b() {
      this.i.clear();
      return this;
   }

   public emh a(emi $$0) {
      this.i.add($$0);
      return this;
   }

   public emh b(emi $$0) {
      this.i.remove($$0);
      return this;
   }

   public djx c() {
      return this.a;
   }

   public dln d() {
      return this.b;
   }

   public iz e() {
      return this.c;
   }

   public azh b(@Nullable iz $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? azh.a(ac.c()) : azh.a(ayz.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public eid g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<emi> i() {
      return this.i;
   }

   public boolean j() {
      return this.f;
   }

   public eml.a a(List<eml.a> $$0, @Nullable iz $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public emh d(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
