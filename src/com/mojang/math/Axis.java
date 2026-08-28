package com.mojang.math;

import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3fc;

public interface Axis {
   Axis XN = new Axis() {
      @Override
      public Quaternionf rotation(final float angle) {
         return new Quaternionf().rotationX(-angle);
      }

      @Override
      public Matrix3f rotate(final Matrix3f matrix, final float angle) {
         return matrix.rotateX(-angle);
      }

      @Override
      public Matrix4f rotate(final Matrix4f matrix, final float angle) {
         return matrix.rotateX(-angle);
      }

      @Override
      public String toString() {
         return "<rotation around -X>";
      }
   };
   Axis XP = new Axis() {
      @Override
      public Quaternionf rotation(final float angle) {
         return new Quaternionf().rotationX(angle);
      }

      @Override
      public Matrix3f rotate(final Matrix3f matrix, final float angle) {
         return matrix.rotateX(angle);
      }

      @Override
      public Matrix4f rotate(final Matrix4f matrix, final float angle) {
         return matrix.rotateX(angle);
      }

      @Override
      public String toString() {
         return "<rotation around +X>";
      }
   };
   Axis YN = new Axis() {
      @Override
      public Quaternionf rotation(final float angle) {
         return new Quaternionf().rotationY(-angle);
      }

      @Override
      public Matrix3f rotate(final Matrix3f matrix, final float angle) {
         return matrix.rotateY(-angle);
      }

      @Override
      public Matrix4f rotate(final Matrix4f matrix, final float angle) {
         return matrix.rotateY(-angle);
      }

      @Override
      public String toString() {
         return "<rotation around -Y>";
      }
   };
   Axis YP = new Axis() {
      @Override
      public Quaternionf rotation(final float angle) {
         return new Quaternionf().rotationY(angle);
      }

      @Override
      public Matrix3f rotate(final Matrix3f matrix, final float angle) {
         return matrix.rotateY(angle);
      }

      @Override
      public Matrix4f rotate(final Matrix4f matrix, final float angle) {
         return matrix.rotateY(angle);
      }

      @Override
      public String toString() {
         return "<rotation around +Y>";
      }
   };
   Axis ZN = new Axis() {
      @Override
      public Quaternionf rotation(final float angle) {
         return new Quaternionf().rotationZ(-angle);
      }

      @Override
      public Matrix3f rotate(final Matrix3f matrix, final float angle) {
         return matrix.rotateZ(-angle);
      }

      @Override
      public Matrix4f rotate(final Matrix4f matrix, final float angle) {
         return matrix.rotateZ(-angle);
      }

      @Override
      public String toString() {
         return "<rotation around -Z>";
      }
   };
   Axis ZP = new Axis() {
      @Override
      public Quaternionf rotation(final float angle) {
         return new Quaternionf().rotationZ(angle);
      }

      @Override
      public Matrix3f rotate(final Matrix3f matrix, final float angle) {
         return matrix.rotateZ(angle);
      }

      @Override
      public Matrix4f rotate(final Matrix4f matrix, final float angle) {
         return matrix.rotateZ(angle);
      }

      @Override
      public String toString() {
         return "<rotation around +Z>";
      }
   };

   static Axis of(final Vector3fc axis) {
      return new Axis() {
         @Override
         public Quaternionf rotation(final float angle) {
            return new Quaternionf().rotationAxis(angle, axis);
         }

         @Override
         public Matrix3f rotate(final Matrix3f matrix, final float angle) {
            return matrix.rotate(angle, axis);
         }

         @Override
         public Matrix4f rotate(final Matrix4f matrix, final float angle) {
            return matrix.rotate(angle, axis);
         }

         @Override
         public String toString() {
            return "<rotation around " + axis + ">";
         }
      };
   }

   Quaternionf rotation(float angle);

   default Quaternionf rotationDegrees(final float angle) {
      return this.rotation(angle * (float) (Math.PI / 180.0));
   }

   Matrix3f rotate(Matrix3f matrix, float angle);

   default Matrix3f rotateDegrees(final Matrix3f matrix, final float angle) {
      return this.rotate(matrix, angle * (float) (Math.PI / 180.0));
   }

   Matrix4f rotate(Matrix4f matrix, float angle);

   default Matrix4f rotateDegrees(final Matrix4f matrix, final float angle) {
      return this.rotate(matrix, angle * (float) (Math.PI / 180.0));
   }
}
