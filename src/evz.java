import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class evz {
   private dsf a;
   private dtw b;
   private iv c;
   private boolean d;
   @Nullable
   private ert e;
   private evn f;
   @Nullable
   private azx g;
   private int h;
   private final List<ewa> i;
   private boolean j;
   private boolean k;

   public evz() {
      this.a = dsf.a;
      this.b = dtw.a;
      this.c = iv.c;
      this.f = evn.b;
      this.i = Lists.newArrayList();
   }

   public evz a() {
      evz $$0 = new evz();
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

   public evz a(dsf $$0) {
      this.a = $$0;
      return this;
   }

   public evz a(dtw $$0) {
      this.b = $$0;
      return this;
   }

   public evz a(iv $$0) {
      this.c = $$0;
      return this;
   }

   public evz a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public evz a(ert $$0) {
      this.e = $$0;
      return this;
   }

   public evz a(@Nullable azx $$0) {
      this.g = $$0;
      return this;
   }

   public evz a(evn $$0) {
      this.f = $$0;
      return this;
   }

   public evz b(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public evz b() {
      this.i.clear();
      return this;
   }

   public evz a(ewa $$0) {
      this.i.add($$0);
      return this;
   }

   public evz b(ewa $$0) {
      this.i.remove($$0);
      return this;
   }

   public dsf c() {
      return this.a;
   }

   public dtw d() {
      return this.b;
   }

   public iv e() {
      return this.c;
   }

   public azx b(@Nullable iv $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? azx.a(ag.c()) : azx.a(azo.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public ert g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<ewa> i() {
      return this.i;
   }

   public boolean j() {
      return this.f == evn.b;
   }

   public ewd.b a(List<ewd.b> $$0, @Nullable iv $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public evz c(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
