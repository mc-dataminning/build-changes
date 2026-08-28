import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class epv {
   private dna a;
   private dor b;
   private jh c;
   private boolean d;
   @Nullable
   private elp e;
   private epj f;
   @Nullable
   private azs g;
   private int h;
   private final List<epw> i;
   private boolean j;
   private boolean k;

   public epv() {
      this.a = dna.a;
      this.b = dor.a;
      this.c = jh.c;
      this.f = epj.b;
      this.i = Lists.newArrayList();
   }

   public epv a() {
      epv $$0 = new epv();
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

   public epv a(dna $$0) {
      this.a = $$0;
      return this;
   }

   public epv a(dor $$0) {
      this.b = $$0;
      return this;
   }

   public epv a(jh $$0) {
      this.c = $$0;
      return this;
   }

   public epv a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public epv a(elp $$0) {
      this.e = $$0;
      return this;
   }

   public epv a(@Nullable azs $$0) {
      this.g = $$0;
      return this;
   }

   public epv a(epj $$0) {
      this.f = $$0;
      return this;
   }

   public epv b(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public epv b() {
      this.i.clear();
      return this;
   }

   public epv a(epw $$0) {
      this.i.add($$0);
      return this;
   }

   public epv b(epw $$0) {
      this.i.remove($$0);
      return this;
   }

   public dna c() {
      return this.a;
   }

   public dor d() {
      return this.b;
   }

   public jh e() {
      return this.c;
   }

   public azs b(@Nullable jh $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? azs.a(ae.c()) : azs.a(azk.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public elp g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<epw> i() {
      return this.i;
   }

   public boolean j() {
      return this.f == epj.b;
   }

   public epz.a a(List<epz.a> $$0, @Nullable jh $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public epv c(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
