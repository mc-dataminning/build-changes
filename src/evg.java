import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class evg {
   private drp a;
   private dtg b;
   private iv c;
   private boolean d;
   @Nullable
   private era e;
   private euu f;
   @Nullable
   private azv g;
   private int h;
   private final List<evh> i;
   private boolean j;
   private boolean k;

   public evg() {
      this.a = drp.a;
      this.b = dtg.a;
      this.c = iv.c;
      this.f = euu.b;
      this.i = Lists.newArrayList();
   }

   public evg a() {
      evg $$0 = new evg();
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

   public evg a(drp $$0) {
      this.a = $$0;
      return this;
   }

   public evg a(dtg $$0) {
      this.b = $$0;
      return this;
   }

   public evg a(iv $$0) {
      this.c = $$0;
      return this;
   }

   public evg a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public evg a(era $$0) {
      this.e = $$0;
      return this;
   }

   public evg a(@Nullable azv $$0) {
      this.g = $$0;
      return this;
   }

   public evg a(euu $$0) {
      this.f = $$0;
      return this;
   }

   public evg b(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public evg b() {
      this.i.clear();
      return this;
   }

   public evg a(evh $$0) {
      this.i.add($$0);
      return this;
   }

   public evg b(evh $$0) {
      this.i.remove($$0);
      return this;
   }

   public drp c() {
      return this.a;
   }

   public dtg d() {
      return this.b;
   }

   public iv e() {
      return this.c;
   }

   public azv b(@Nullable iv $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? azv.a(ag.c()) : azv.a(azm.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public era g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<evh> i() {
      return this.i;
   }

   public boolean j() {
      return this.f == euu.b;
   }

   public evk.b a(List<evk.b> $$0, @Nullable iv $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public evg c(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
