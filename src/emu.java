import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class emu {
   private dkf a;
   private dlv b;
   private ja c;
   private boolean d;
   @Nullable
   private eip e;
   private boolean f;
   @Nullable
   private ayo g;
   private int h;
   private final List<emv> i;
   private boolean j;
   private boolean k;

   public emu() {
      this.a = dkf.a;
      this.b = dlv.a;
      this.c = ja.c;
      this.f = true;
      this.i = Lists.newArrayList();
   }

   public emu a() {
      emu $$0 = new emu();
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

   public emu a(dkf $$0) {
      this.a = $$0;
      return this;
   }

   public emu a(dlv $$0) {
      this.b = $$0;
      return this;
   }

   public emu a(ja $$0) {
      this.c = $$0;
      return this;
   }

   public emu a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public emu a(eip $$0) {
      this.e = $$0;
      return this;
   }

   public emu a(@Nullable ayo $$0) {
      this.g = $$0;
      return this;
   }

   public emu b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public emu c(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public emu b() {
      this.i.clear();
      return this;
   }

   public emu a(emv $$0) {
      this.i.add($$0);
      return this;
   }

   public emu b(emv $$0) {
      this.i.remove($$0);
      return this;
   }

   public dkf c() {
      return this.a;
   }

   public dlv d() {
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
   public eip g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<emv> i() {
      return this.i;
   }

   public boolean j() {
      return this.f;
   }

   public emy.a a(List<emy.a> $$0, @Nullable ja $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public emu d(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
