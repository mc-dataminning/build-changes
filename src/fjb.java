import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class fjb implements fld {
   protected static final int a = 1;
   public static final boolean b = ac.aU;
   private final fiw l;
   private final boolean m;
   private boolean n;
   @Nullable
   protected fjc c;
   protected final fii[] d = new fii[1];
   @Nullable
   protected fii e;
   protected flu.b f = flu.b.b;
   protected final fle g = new fle();
   protected final HashMap<String, Object> h = new HashMap<>();
   protected final HashMap<String, flj> i = new HashMap<>();
   protected final Set<String> j = new HashSet<>();
   protected final Set<String> k = new HashSet<>();

   public fjb(fiw $$0, boolean $$1) {
      this.l = $$0;
      this.m = $$1;
   }

   public boolean a() {
      return this.m;
   }

   @Override
   public void a(fjr $$0) {
      if (this.c == null || this.c.b() != $$0) {
         this.j.addAll(this.h.keySet());
         this.k.addAll(this.i.keySet());
      }

      this.c = this.l.b().a($$0);
   }

   @Override
   public void a(String $$0, flj $$1) {
      this.i.put($$0, $$1);
      this.k.add($$0);
   }

   @Override
   public void a(String $$0, int... $$1) {
      this.h.put($$0, $$1);
      this.j.add($$0);
   }

   @Override
   public void a(String $$0, float... $$1) {
      this.h.put($$0, $$1);
      this.j.add($$0);
   }

   @Override
   public void a(String $$0, Matrix4f $$1) {
      this.h.put($$0, $$1.get(new float[16]));
      this.j.add($$0);
   }

   @Override
   public void a(fle $$0) {
      this.g.a($$0);
   }

   @Override
   public void a(int $$0, int $$1, int $$2, int $$3) {
      this.g.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b() {
      this.g.a();
   }

   @Override
   public void a(int $$0, fii $$1) {
      if ($$0 >= 0 && $$0 < 1) {
         this.d[$$0] = $$1;
      } else {
         throw new IllegalArgumentException("Vertex buffer slot is out of range: " + $$0);
      }
   }

   @Override
   public void a(fii $$0, flu.b $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public void a(int $$0, int $$1) {
      if (this.n) {
         throw new IllegalStateException("Can't use a closed render pass");
      } else {
         this.l.a(this, $$0, $$1, this.f);
      }
   }

   @Override
   public void a(Collection<fld.a> $$0) {
      if (this.n) {
         throw new IllegalStateException("Can't use a closed render pass");
      } else {
         this.l.a(this, $$0);
      }
   }

   @Override
   public void b(int $$0, int $$1) {
      if (this.n) {
         throw new IllegalStateException("Can't use a closed render pass");
      } else {
         this.l.a(this, $$0, $$1, null);
      }
   }

   @Override
   public void close() {
      if (!this.n) {
         this.n = true;
         this.l.a();
      }
   }
}
