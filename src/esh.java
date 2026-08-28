import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class esh {
   private dpf a;
   private dqw b;
   private ji c;
   private boolean d;
   @Nullable
   private eob e;
   private erv f;
   @Nullable
   private azh g;
   private int h;
   private final List<esi> i;
   private boolean j;
   private boolean k;

   public esh() {
      this.a = dpf.a;
      this.b = dqw.a;
      this.c = ji.c;
      this.f = erv.b;
      this.i = Lists.newArrayList();
   }

   public esh a() {
      esh $$0 = new esh();
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

   public esh a(dpf $$0) {
      this.a = $$0;
      return this;
   }

   public esh a(dqw $$0) {
      this.b = $$0;
      return this;
   }

   public esh a(ji $$0) {
      this.c = $$0;
      return this;
   }

   public esh a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public esh a(eob $$0) {
      this.e = $$0;
      return this;
   }

   public esh a(@Nullable azh $$0) {
      this.g = $$0;
      return this;
   }

   public esh a(erv $$0) {
      this.f = $$0;
      return this;
   }

   public esh b(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public esh b() {
      this.i.clear();
      return this;
   }

   public esh a(esi $$0) {
      this.i.add($$0);
      return this;
   }

   public esh b(esi $$0) {
      this.i.remove($$0);
      return this;
   }

   public dpf c() {
      return this.a;
   }

   public dqw d() {
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
   public eob g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<esi> i() {
      return this.i;
   }

   public boolean j() {
      return this.f == erv.b;
   }

   public esl.b a(List<esl.b> $$0, @Nullable ji $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public esh c(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
