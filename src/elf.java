import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class elf {
   private div a;
   private dkl b;
   private io c;
   private boolean d;
   @Nullable
   private ehb e;
   private boolean f;
   @Nullable
   private ayk g;
   private int h;
   private final List<elg> i;
   private boolean j;
   private boolean k;

   public elf() {
      this.a = div.a;
      this.b = dkl.a;
      this.c = io.c;
      this.f = true;
      this.i = Lists.newArrayList();
   }

   public elf a() {
      elf $$0 = new elf();
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

   public elf a(div $$0) {
      this.a = $$0;
      return this;
   }

   public elf a(dkl $$0) {
      this.b = $$0;
      return this;
   }

   public elf a(io $$0) {
      this.c = $$0;
      return this;
   }

   public elf a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public elf a(ehb $$0) {
      this.e = $$0;
      return this;
   }

   public elf a(@Nullable ayk $$0) {
      this.g = $$0;
      return this;
   }

   public elf b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public elf c(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public elf b() {
      this.i.clear();
      return this;
   }

   public elf a(elg $$0) {
      this.i.add($$0);
      return this;
   }

   public elf b(elg $$0) {
      this.i.remove($$0);
      return this;
   }

   public div c() {
      return this.a;
   }

   public dkl d() {
      return this.b;
   }

   public io e() {
      return this.c;
   }

   public ayk b(@Nullable io $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? ayk.a(ac.c()) : ayk.a(ayd.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public ehb g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<elg> i() {
      return this.i;
   }

   public boolean j() {
      return this.f;
   }

   public elj.a a(List<elj.a> $$0, @Nullable io $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public elf d(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
