import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class enj {
   private dkt a;
   private dmk b;
   private jd c;
   private boolean d;
   @Nullable
   private eje e;
   private boolean f;
   @Nullable
   private ayv g;
   private int h;
   private final List<enk> i;
   private boolean j;
   private boolean k;

   public enj() {
      this.a = dkt.a;
      this.b = dmk.a;
      this.c = jd.c;
      this.f = true;
      this.i = Lists.newArrayList();
   }

   public enj a() {
      enj $$0 = new enj();
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

   public enj a(dkt $$0) {
      this.a = $$0;
      return this;
   }

   public enj a(dmk $$0) {
      this.b = $$0;
      return this;
   }

   public enj a(jd $$0) {
      this.c = $$0;
      return this;
   }

   public enj a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public enj a(eje $$0) {
      this.e = $$0;
      return this;
   }

   public enj a(@Nullable ayv $$0) {
      this.g = $$0;
      return this;
   }

   public enj b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public enj c(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public enj b() {
      this.i.clear();
      return this;
   }

   public enj a(enk $$0) {
      this.i.add($$0);
      return this;
   }

   public enj b(enk $$0) {
      this.i.remove($$0);
      return this;
   }

   public dkt c() {
      return this.a;
   }

   public dmk d() {
      return this.b;
   }

   public jd e() {
      return this.c;
   }

   public ayv b(@Nullable jd $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? ayv.a(ad.c()) : ayv.a(ayn.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public eje g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<enk> i() {
      return this.i;
   }

   public boolean j() {
      return this.f;
   }

   public enn.a a(List<enn.a> $$0, @Nullable jd $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public enj d(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
