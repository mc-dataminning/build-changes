import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class efa {
   private ddk a;
   private dfa b;
   private hz c;
   private boolean d;
   @Nullable
   private eaw e;
   private boolean f;
   @Nullable
   private awo g;
   private int h;
   private final List<efb> i;
   private boolean j;
   private boolean k;

   public efa() {
      this.a = ddk.a;
      this.b = dfa.a;
      this.c = hz.c;
      this.f = true;
      this.i = Lists.newArrayList();
   }

   public efa a() {
      efa $$0 = new efa();
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

   public efa a(ddk $$0) {
      this.a = $$0;
      return this;
   }

   public efa a(dfa $$0) {
      this.b = $$0;
      return this;
   }

   public efa a(hz $$0) {
      this.c = $$0;
      return this;
   }

   public efa a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public efa a(eaw $$0) {
      this.e = $$0;
      return this;
   }

   public efa a(@Nullable awo $$0) {
      this.g = $$0;
      return this;
   }

   public efa b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public efa c(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public efa b() {
      this.i.clear();
      return this;
   }

   public efa a(efb $$0) {
      this.i.add($$0);
      return this;
   }

   public efa b(efb $$0) {
      this.i.remove($$0);
      return this;
   }

   public ddk c() {
      return this.a;
   }

   public dfa d() {
      return this.b;
   }

   public hz e() {
      return this.c;
   }

   public awo b(@Nullable hz $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? awo.a(ac.b()) : awo.a(awh.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public eaw g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<efb> i() {
      return this.i;
   }

   public boolean j() {
      return this.f;
   }

   public efe.a a(List<efe.a> $$0, @Nullable hz $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public efa d(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
