import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.ProviderMismatchException;
import java.nio.file.ReadOnlyFileSystemException;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchEvent.Modifier;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

class aso implements Path {
   private static final BasicFileAttributes a = new asm() {
      @Override
      public boolean isRegularFile() {
         return false;
      }

      @Override
      public boolean isDirectory() {
         return true;
      }
   };
   private static final BasicFileAttributes b = new asm() {
      @Override
      public boolean isRegularFile() {
         return true;
      }

      @Override
      public boolean isDirectory() {
         return false;
      }
   };
   private static final Comparator<aso> c = Comparator.comparing(aso::n);
   private final String d;
   private final asq e;
   @Nullable
   private final aso f;
   @Nullable
   private List<String> g;
   @Nullable
   private String h;
   private final asr i;

   public aso(asq $$0, String $$1, @Nullable aso $$2, asr $$3) {
      this.e = $$0;
      this.d = $$1;
      this.f = $$2;
      this.i = $$3;
   }

   private aso a(@Nullable aso $$0, String $$1) {
      return new aso(this.e, $$1, $$0, asr.b);
   }

   public asq a() {
      return this.e;
   }

   @Override
   public boolean isAbsolute() {
      return this.i != asr.b;
   }

   @Override
   public File toFile() {
      if (this.i instanceof asr.b $$0) {
         return $$0.a().toFile();
      } else {
         throw new UnsupportedOperationException("Path " + this.n() + " does not represent file");
      }
   }

   @Nullable
   public aso b() {
      return this.isAbsolute() ? this.e.b() : null;
   }

   public aso c() {
      return this.a(null, this.d);
   }

   @Nullable
   public aso d() {
      return this.f;
   }

   @Override
   public int getNameCount() {
      return this.l().size();
   }

   private List<String> l() {
      if (this.d.isEmpty()) {
         return List.of();
      } else {
         if (this.g == null) {
            Builder<String> $$0 = ImmutableList.builder();
            if (this.f != null) {
               $$0.addAll(this.f.l());
            }

            $$0.add(this.d);
            this.g = $$0.build();
         }

         return this.g;
      }
   }

   public aso a(int $$0) {
      List<String> $$1 = this.l();
      if ($$0 >= 0 && $$0 < $$1.size()) {
         return this.a(null, $$1.get($$0));
      } else {
         throw new IllegalArgumentException("Invalid index: " + $$0);
      }
   }

   public aso a(int $$0, int $$1) {
      List<String> $$2 = this.l();
      if ($$0 >= 0 && $$1 <= $$2.size() && $$0 < $$1) {
         aso $$3 = null;

         for (int $$4 = $$0; $$4 < $$1; $$4++) {
            $$3 = this.a($$3, $$2.get($$4));
         }

         return $$3;
      } else {
         throw new IllegalArgumentException();
      }
   }

   @Override
   public boolean startsWith(Path $$0) {
      if ($$0.isAbsolute() != this.isAbsolute()) {
         return false;
      } else if ($$0 instanceof aso $$1) {
         if ($$1.e != this.e) {
            return false;
         } else {
            List<String> $$2 = this.l();
            List<String> $$3 = $$1.l();
            int $$4 = $$3.size();
            if ($$4 > $$2.size()) {
               return false;
            } else {
               for (int $$5 = 0; $$5 < $$4; $$5++) {
                  if (!$$3.get($$5).equals($$2.get($$5))) {
                     return false;
                  }
               }

               return true;
            }
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean endsWith(Path $$0) {
      if ($$0.isAbsolute() && !this.isAbsolute()) {
         return false;
      } else if ($$0 instanceof aso $$1) {
         if ($$1.e != this.e) {
            return false;
         } else {
            List<String> $$2 = this.l();
            List<String> $$3 = $$1.l();
            int $$4 = $$3.size();
            int $$5 = $$2.size() - $$4;
            if ($$5 < 0) {
               return false;
            } else {
               for (int $$6 = $$4 - 1; $$6 >= 0; $$6--) {
                  if (!$$3.get($$6).equals($$2.get($$5 + $$6))) {
                     return false;
                  }
               }

               return true;
            }
         }
      } else {
         return false;
      }
   }

   public aso e() {
      return this;
   }

   public aso a(Path $$0) {
      aso $$1 = this.c($$0);
      return $$0.isAbsolute() ? $$1 : this.a($$1.l());
   }

   private aso a(List<String> $$0) {
      aso $$1 = this;

      for (String $$2 : $$0) {
         $$1 = $$1.a($$2);
      }

      return $$1;
   }

   aso a(String $$0) {
      if (a(this.i)) {
         return new aso(this.e, $$0, this, this.i);
      } else if (this.i instanceof asr.a $$1) {
         aso $$2 = $$1.a().get($$0);
         return $$2 != null ? $$2 : new aso(this.e, $$0, this, asr.a);
      } else if (this.i instanceof asr.b) {
         return new aso(this.e, $$0, this, asr.a);
      } else {
         throw new AssertionError("All content types should be already handled");
      }
   }

   private static boolean a(asr $$0) {
      return $$0 == asr.a || $$0 == asr.b;
   }

   public aso b(Path $$0) {
      aso $$1 = this.c($$0);
      if (this.isAbsolute() != $$1.isAbsolute()) {
         throw new IllegalArgumentException("absolute mismatch");
      } else {
         List<String> $$2 = this.l();
         List<String> $$3 = $$1.l();
         if ($$2.size() >= $$3.size()) {
            throw new IllegalArgumentException();
         } else {
            for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
               if (!$$2.get($$4).equals($$3.get($$4))) {
                  throw new IllegalArgumentException();
               }
            }

            return $$1.a($$2.size(), $$3.size());
         }
      }
   }

   @Override
   public URI toUri() {
      try {
         return new URI("x-mc-link", this.e.a().name(), this.n(), null);
      } catch (URISyntaxException var2) {
         throw new AssertionError("Failed to create URI", var2);
      }
   }

   public aso f() {
      return this.isAbsolute() ? this : this.e.b().a(this);
   }

   public aso a(LinkOption... $$0) {
      return this.f();
   }

   @Override
   public WatchKey register(WatchService $$0, Kind<?>[] $$1, Modifier... $$2) {
      throw new UnsupportedOperationException();
   }

   @Override
   public int compareTo(Path $$0) {
      aso $$1 = this.c($$0);
      return c.compare(this, $$1);
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else if ($$0 instanceof aso $$1) {
         if (this.e != $$1.e) {
            return false;
         } else {
            boolean $$2 = this.m();
            if ($$2 != $$1.m()) {
               return false;
            } else {
               return $$2 ? this.i == $$1.i : Objects.equals(this.f, $$1.f) && Objects.equals(this.d, $$1.d);
            }
         }
      } else {
         return false;
      }
   }

   private boolean m() {
      return !a(this.i);
   }

   @Override
   public int hashCode() {
      return this.m() ? this.i.hashCode() : this.d.hashCode();
   }

   @Override
   public String toString() {
      return this.n();
   }

   private String n() {
      if (this.h == null) {
         StringBuilder $$0 = new StringBuilder();
         if (this.isAbsolute()) {
            $$0.append("/");
         }

         Joiner.on("/").appendTo($$0, this.l());
         this.h = $$0.toString();
      }

      return this.h;
   }

   private aso c(@Nullable Path $$0) {
      if ($$0 == null) {
         throw new NullPointerException();
      } else {
         if ($$0 instanceof aso $$1 && $$1.e == this.e) {
            return $$1;
         }

         throw new ProviderMismatchException();
      }
   }

   public boolean g() {
      return this.m();
   }

   @Nullable
   public Path h() {
      return this.i instanceof asr.b $$0 ? $$0.a() : null;
   }

   @Nullable
   public asr.a i() {
      return this.i instanceof asr.a $$0 ? $$0 : null;
   }

   public BasicFileAttributeView j() {
      return new BasicFileAttributeView() {
         @Override
         public String name() {
            return "basic";
         }

         @Override
         public BasicFileAttributes readAttributes() throws IOException {
            return aso.this.k();
         }

         @Override
         public void setTimes(FileTime $$0, FileTime $$1, FileTime $$2) {
            throw new ReadOnlyFileSystemException();
         }
      };
   }

   public BasicFileAttributes k() throws IOException {
      if (this.i instanceof asr.a) {
         return a;
      } else if (this.i instanceof asr.b) {
         return b;
      } else {
         throw new NoSuchFileException(this.n());
      }
   }
}
