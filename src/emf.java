import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class emf {
   private djv a;
   private dll b;
   private iz c;
   private boolean d;
   @Nullable
   private eib e;
   private boolean f;
   @Nullable
   private azg g;
   private int h;
   private final List<emg> i;
   private boolean j;
   private boolean k;

   public emf() {
      this.a = djv.a;
      this.b = dll.a;
      this.c = iz.c;
      this.f = true;
      this.i = Lists.newArrayList();
   }

   public emf a() {
      emf $$0 = new emf();
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

   public emf a(djv $$0) {
      this.a = $$0;
      return this;
   }

   public emf a(dll $$0) {
      this.b = $$0;
      return this;
   }

   public emf a(iz $$0) {
      this.c = $$0;
      return this;
   }

   public emf a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public emf a(eib $$0) {
      this.e = $$0;
      return this;
   }

   public emf a(@Nullable azg $$0) {
      this.g = $$0;
      return this;
   }

   public emf b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public emf c(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public emf b() {
      this.i.clear();
      return this;
   }

   public emf a(emg $$0) {
      this.i.add($$0);
      return this;
   }

   public emf b(emg $$0) {
      this.i.remove($$0);
      return this;
   }

   public djv c() {
      return this.a;
   }

   public dll d() {
      return this.b;
   }

   public iz e() {
      return this.c;
   }

   public azg b(@Nullable iz $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? azg.a(ac.c()) : azg.a(ayy.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public eib g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<emg> i() {
      return this.i;
   }

   public boolean j() {
      return this.f;
   }

   public emj.a a(List<emj.a> $$0, @Nullable iz $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public emf d(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
