import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class ems {
   private dke a;
   private dlu b;
   private ja c;
   private boolean d;
   @Nullable
   private eio e;
   private boolean f;
   @Nullable
   private ayo g;
   private int h;
   private final List<emt> i;
   private boolean j;
   private boolean k;

   public ems() {
      this.a = dke.a;
      this.b = dlu.a;
      this.c = ja.c;
      this.f = true;
      this.i = Lists.newArrayList();
   }

   public ems a() {
      ems $$0 = new ems();
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

   public ems a(dke $$0) {
      this.a = $$0;
      return this;
   }

   public ems a(dlu $$0) {
      this.b = $$0;
      return this;
   }

   public ems a(ja $$0) {
      this.c = $$0;
      return this;
   }

   public ems a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public ems a(eio $$0) {
      this.e = $$0;
      return this;
   }

   public ems a(@Nullable ayo $$0) {
      this.g = $$0;
      return this;
   }

   public ems b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public ems c(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public ems b() {
      this.i.clear();
      return this;
   }

   public ems a(emt $$0) {
      this.i.add($$0);
      return this;
   }

   public ems b(emt $$0) {
      this.i.remove($$0);
      return this;
   }

   public dke c() {
      return this.a;
   }

   public dlu d() {
      return this.b;
   }

   public ja e() {
      return this.c;
   }

   public ayo b(@Nullable ja $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? ayo.a(ac.c()) : ayo.a(ayg.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public eio g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<emt> i() {
      return this.i;
   }

   public boolean j() {
      return this.f;
   }

   public emw.a a(List<emw.a> $$0, @Nullable ja $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public ems d(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
