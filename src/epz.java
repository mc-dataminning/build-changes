import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class epz {
   private dnf a;
   private dow b;
   private jh c;
   private boolean d;
   @Nullable
   private elt e;
   private epn f;
   @Nullable
   private azv g;
   private int h;
   private final List<eqa> i;
   private boolean j;
   private boolean k;

   public epz() {
      this.a = dnf.a;
      this.b = dow.a;
      this.c = jh.c;
      this.f = epn.b;
      this.i = Lists.newArrayList();
   }

   public epz a() {
      epz $$0 = new epz();
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

   public epz a(dnf $$0) {
      this.a = $$0;
      return this;
   }

   public epz a(dow $$0) {
      this.b = $$0;
      return this;
   }

   public epz a(jh $$0) {
      this.c = $$0;
      return this;
   }

   public epz a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public epz a(elt $$0) {
      this.e = $$0;
      return this;
   }

   public epz a(@Nullable azv $$0) {
      this.g = $$0;
      return this;
   }

   public epz a(epn $$0) {
      this.f = $$0;
      return this;
   }

   public epz b(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public epz b() {
      this.i.clear();
      return this;
   }

   public epz a(eqa $$0) {
      this.i.add($$0);
      return this;
   }

   public epz b(eqa $$0) {
      this.i.remove($$0);
      return this;
   }

   public dnf c() {
      return this.a;
   }

   public dow d() {
      return this.b;
   }

   public jh e() {
      return this.c;
   }

   public azv b(@Nullable jh $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? azv.a(ae.c()) : azv.a(azn.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public elt g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<eqa> i() {
      return this.i;
   }

   public boolean j() {
      return this.f == epn.b;
   }

   public eqd.a a(List<eqd.a> $$0, @Nullable jh $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public epz c(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
