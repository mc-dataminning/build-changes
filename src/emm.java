import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class emm {
   private dkc a;
   private dls b;
   private ja c;
   private boolean d;
   @Nullable
   private eii e;
   private boolean f;
   @Nullable
   private aym g;
   private int h;
   private final List<emn> i;
   private boolean j;
   private boolean k;

   public emm() {
      this.a = dkc.a;
      this.b = dls.a;
      this.c = ja.c;
      this.f = true;
      this.i = Lists.newArrayList();
   }

   public emm a() {
      emm $$0 = new emm();
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

   public emm a(dkc $$0) {
      this.a = $$0;
      return this;
   }

   public emm a(dls $$0) {
      this.b = $$0;
      return this;
   }

   public emm a(ja $$0) {
      this.c = $$0;
      return this;
   }

   public emm a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public emm a(eii $$0) {
      this.e = $$0;
      return this;
   }

   public emm a(@Nullable aym $$0) {
      this.g = $$0;
      return this;
   }

   public emm b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public emm c(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public emm b() {
      this.i.clear();
      return this;
   }

   public emm a(emn $$0) {
      this.i.add($$0);
      return this;
   }

   public emm b(emn $$0) {
      this.i.remove($$0);
      return this;
   }

   public dkc c() {
      return this.a;
   }

   public dls d() {
      return this.b;
   }

   public ja e() {
      return this.c;
   }

   public aym b(@Nullable ja $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? aym.a(ac.c()) : aym.a(aye.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public eii g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<emn> i() {
      return this.i;
   }

   public boolean j() {
      return this.f;
   }

   public emq.a a(List<emq.a> $$0, @Nullable ja $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public emm d(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
